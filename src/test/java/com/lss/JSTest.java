package com.lss;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;

public class JSTest {
    WebDriver driver;
    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    /**
     * 打开网址
     * 执行JS
     */
    @Test
    public void jsTest() throws InterruptedException {
        driver.get("http://www.baidu.com");
        //执行JS
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("document.getElementById(\"kw\").setAttribute(\"value\",\"sdghr\")");
        Thread.sleep(3000);
    }

    @AfterMethod
    public void Closed() {
        driver.quit();
    }
}
