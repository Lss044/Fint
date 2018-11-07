package com.lss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SelectTest {
    WebDriver driver;
    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    /**
     * 打开网址
     * 下拉框选择第3个元素
     * 第二次选择
     * 第三次选择
     */
    @Test
    public void SelectTest() throws InterruptedException {
        driver.get("");
        WebElement element=driver.findElement(By.id(""));
        //实例化select类
        Select select=new Select(element);
        //通过索引方式选择下拉框
        select.selectByIndex(2);
        Thread.sleep(3000);
        //通过属性value值选择下拉框
        select.deselectByValue("");
        Thread.sleep(3000);
        //通过文本值来选择下拉框
        select.deselectByVisibleText("");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void Closed() {
        driver.quit();
    }
}
