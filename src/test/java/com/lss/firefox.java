package com.lss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class firefox {
    @Test
    public static void testDriver() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Program Files\\Mozilla Firefox\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://www.baidu.com/ ");
                driver.manage().window().maximize();
        driver.findElement(By.name("wd")).sendKeys("testfan");
        Thread.sleep(1500);
        System.out.println(driver.getTitle());
        driver.quit();
    }
}
