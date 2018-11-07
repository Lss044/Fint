package com.lss;



import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;

public class TestDW {
    WebDriver driver;
    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    /**
     * 打开百度首页
     * 获取新闻文本
     */
    @Test
    public void getTextTest(){
        driver.get("http://www.baidu.com");
        String t=driver.findElement(By.id("kw")).getText();
        Assert.assertEquals(t,"百度一下");
    }
    /**
     * 打开百度首页
     * 判断百度一下按钮是否可见
     */
    @Test
    public void isDisplayTest(){
        driver.get("http://www.baidu.com");
        boolean b=driver.findElement(By.id("su")).isDisplayed();
        Assert.assertTrue(b);
    }
    /**
     * 打开网址
     * 判断单选框是否被选中，用isSeleted()方法，写法同上
     */

    /**
     * 打开网址
     * 判断元素是否被激活，用isEnabled()方法，写法同上
     */
    @Test
    public void isEnableTest(){
        driver.get("http://www.baidu.com");
        boolean b=driver.findElement(By.id("su")).isEnabled();
        Assert.assertTrue(b);
    }
    /**
     * 截图百度首页
     */
    @Test
    public void shootTest(){
        driver.get("http://www.baidu.com");
        File file=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        try {
            FileUtils.copyFile(file,new File("F:\\test1.png"));
        }catch (IOException e){
            e.printStackTrace();
        }
    }
    @AfterMethod
    public void Closed() {
        driver.quit();
    }

}
