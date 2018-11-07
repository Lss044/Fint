package com.nodetest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class node1 {
  //  @Test
//    public void testChrome() throws InterruptedException, MalformedURLException {
//        //创建一个
//        DesiredCapabilities dc = DesiredCapabilities.chrome();
//        //实例化driver
//        WebDriver driver = new RemoteWebDriver(new URL("http://192.168.1.102:4444/wd/hub"), dc);
//        driver.get("http://www.baidu.com");
//        Thread.sleep(10000);
//        driver.quit();
//    }

    @DataProvider(name = "data4", parallel = true)
    public Object[][] test1() {
        return new Object[][]{
                {"firefox"," http://192.168.1.102:5555"},
                {"chrome","http://192.168.1.102:7777"}
        };
    }

    @Test(dataProvider = "data4")
    public void testGrid(String browser,String url) throws InterruptedException, MalformedURLException {
        DesiredCapabilities dc = null;
       if (browser.equals("chrome")) {
            dc = DesiredCapabilities.chrome();
        }else if (browser.equals("firefox")) {
           dc = DesiredCapabilities.firefox();
       }

        WebDriver driver= new RemoteWebDriver(new URL(url+"/wd/hub"), dc);
        driver.get("http://www.baidu.com");
        Thread.sleep(10000);
        driver.quit();
    }
}
