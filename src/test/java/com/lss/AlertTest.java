package com.lss;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//针对js弹窗，按钮无法右击定位元素的场景
public class AlertTest {
    WebDriver driver;
    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    /**
     * 打开网址
     * 点击Alert按钮
     * 在Alert警告框点击确认按钮
     */
    @Test
    public void AlertTest() throws InterruptedException{
        driver.get("");
        driver.findElement(By.className("alert")).click();
        Thread.sleep(3000);
        //把控制权转交给alert
        Alert alert=driver.switchTo().alert();
        //获取警告框的文本值
        String text=alert.getText();
        alert.accept();
    }
    /**
     * 打开网址
     * 点击Confirm按钮
     * 在Confirm警告框点击取消按钮
     * 再次点击确定按钮
     */
    @Test
    public void ConfirmTest() throws InterruptedException{
        driver.get("");
        driver.findElement(By.className("confirm")).click();
        Thread.sleep(3000);
        //把控制权转交给alert
        Alert alert=driver.switchTo().alert();
        //点击取消
        alert.dismiss();
        Thread.sleep(3000);
        //点击确定
        alert.accept();
    }
    /**
     * 打开网址
     * 点击Prompt按钮
     * 在Prompt弹窗中，输入“这是个Prompt”
     * 点击确定按钮
     * 再次点击确定按钮
     */
    @Test
    public void PromptTest() throws InterruptedException{
        driver.get("");
        driver.findElement(By.className("prompt")).click();
        Thread.sleep(3000);
        //把控制权转交给alert
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("这是个Prompt");
        alert.accept();
        Thread.sleep(3000);
        alert.accept();
    }
    @AfterMethod
    public void Closed() {
        driver.quit();
    }
}
