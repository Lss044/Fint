package com.lss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WaitTest {
    WebDriver driver;
    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver=new ChromeDriver();
        //全局等待==隐形等待，没有显性等待智能
    //    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    /**
     * 打开网址
     * 点击wait按钮
     * 获取文本，判断是否为“期望值”
     */
    @Test
    public void waitTest() throws InterruptedException {
        driver.get("");
        driver.findElement(By.xpath("")).click();
        //显性等待，更智能
        WebDriverWait wait=new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
        //定位点击按钮出现的文字
        String text=driver.findElement(By.xpath("")).getText();
        Assert.assertEquals(text,"");
    }

    @AfterMethod
    public void Closed() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
