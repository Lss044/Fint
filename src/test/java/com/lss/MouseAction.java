package com.lss;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.List;

public class MouseAction {
    WebDriver driver;
    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    /**
     * 打开网址
     * 鼠标移动到某按钮上
     * 验证出现的文字
     */
    @Test
    public void MoveTest() throws InterruptedException {
        driver.get("");
        WebElement element=driver.findElement(By.xpath(""));
        //实例化actions类
        Actions actions=new Actions(driver);
        //鼠标移动
        actions.moveToElement(element).perform();
        Thread.sleep(3000);
        //获取鼠标移到按钮后出现的文字
        String hello=driver.findElement(By.xpath("//*[text()='Hello World!']")).getText();

        Assert.assertEquals(hello,"Hello World!");
    }
    /**
     * 打开网址
     * 拖动元素到某个位置指定坐标位置
     */
    @Test
    public void MoveToTest1() throws InterruptedException {
        driver.get("");
        WebElement element=driver.findElement(By.xpath(""));
        Actions actions=new Actions(driver);
        actions.dragAndDropBy(element,500,500).perform();
        Thread.sleep(3000);
    }
    /**
     * 打开网址
     * 拖动元素到某个位置定位某个元素的位置
     */
    @Test
    public void MoveToTest2() throws InterruptedException {
        driver.get("");
        WebElement element1=driver.findElement(By.xpath(""));
        WebElement element2=driver.findElement(By.xpath(""));

        Actions actions=new Actions(driver);
        actions.clickAndHold(element1).moveToElement(element2).release(element1).perform();
        Thread.sleep(3000);
    }
    /**
     * 打开网址
     * 下拉框多选1-3个选项
     * 下拉框多选第1和第3个选项（用Keys.CONTROL实现）
     */
    @Test
    public void MoreSelectTest() throws InterruptedException {
        driver.get("");
        WebElement element1 = driver.findElement(By.xpath(""));
        List<WebElement> list=driver.findElements(By.xpath(""));

        Actions actions=new Actions(driver);
        actions.keyDown(Keys.SHIFT).
                click(list.get(0)).
                click(list.get(2)).
                keyUp(Keys.SHIFT).
                perform();
    }
    /**
     * 打开网址
     * 用robot类实现键盘快捷组合按钮
     */
    @Test
    public void savaHtml() throws AWTException, InterruptedException {
        driver.get("");
        Robot robot=new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_S);
        Thread.sleep(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
    }
    @AfterMethod
    public void Closed() {
        driver.quit();
    }
}
