package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OpenBrowserTest {
    WebDriver driver;
    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    @Test
    public void OpenChrome() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Program Files(x86)\\Google\\Chrome\\Application\\chromedriver.exe");

            driver.get("http://www.baidu.com/");
            driver.manage().window().maximize();
            driver.findElement(By.name("wd")).sendKeys("testfan");
            Thread.sleep(1500);
            System.out.println(driver.getTitle());
            driver.close();
    }
    @Test
    public void getUrl() throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Program Files(x86)\\Google\\Chrome\\Application\\chromedriver.exe");

        driver.get("http://www.baidu.com/");
        driver.manage().window().maximize();
        String url=driver.getCurrentUrl();
        Assert.assertEquals(url,"http://www.baidu.com/");

    }
    @AfterMethod
    public void ClosedBrowser(){
        driver.quit();
    }
 }
