package com.lss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowSelcetTest {
    WebDriver driver;
    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    /**
     * 打开网址
     * 点击open new window
     * 点击baidu
     */
    @Test
    public void testWin() throws InterruptedException {
        driver.get("");
        driver.findElement(By.linkText("")).click();
        Thread.sleep(3000);
        //当前driver所在的页面的句柄值
        String handel=driver.getWindowHandle();
        //For循环判断获取到的handles是否等于handle
        for(String handles:driver.getWindowHandles()){
            if(handles.equals(handel)){
                continue;
            }else {
                driver.switchTo().window(handles);
            }
        }
        driver.findElement(By.linkText("")).click();
        Thread.sleep(3000);
    }

    @AfterMethod
    public void Closed() {
        driver.quit();
    }
}
