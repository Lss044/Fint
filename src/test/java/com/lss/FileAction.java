package com.lss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class FileAction {
    WebDriver driver;
    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    /**
     * 打开网址
     * 进行文件上传
     */
    @Test
    public void uploadTest() throws InterruptedException {
        driver.get("");
        //上传文件
        driver.findElement(By.xpath("")).sendKeys("F:\\test1.png");
        Thread.sleep(3000);
    }

    @Test
    public void downloadFile(){
        String downloadFilepath="D:\\";

        HashMap<String,Object> chromePrefs=new HashMap<String, Object>();
        chromePrefs.put("profile.default_content_settings.popups",0);
        chromePrefs.put("download.default_directory",downloadFilepath);

        ChromeOptions options=new ChromeOptions();
        options.setExperimentalOption("prefs",chromePrefs);

        System.setProperty("webdriver.chrome.driver",".//drivers//chromedriver.exe");
        WebDriver driver=new ChromeDriver(options);

        driver.get("");
        driver.findElement(By.xpath(""));
    }




    @AfterMethod
    public void Closed() {
        driver.quit();
    }
}
