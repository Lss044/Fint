package httpfan.suites;

import java.util.concurrent.TimeUnit;
import httpfan.cases.Login;
import httpfan.cases.Search2;
import httpfan.cases.Login;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestLogin {
    WebDriver driver;
    @BeforeMethod
    public void OpenBrowser(){
        System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        driver=new ChromeDriver();
    }
    @Test
    public void TestLoginSuit() throws InterruptedException {
        driver.get("https://jc-lab.yscredit.com/user/openLoginForm?openLoginForm=true");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//*[@id='mobileLogin']/div[1]/div[2]")).click();
        Thread.sleep(2000);
        //登录操作
        Login login=new Login();
        login.setUserName(driver,"linsisi");
        login.setPassWord(driver, "gc8we0");
        login.clickLogin(driver);

        Thread.sleep(5000);
        System.out.println("登录成功");
		/*//简单查询操作
		Search1 search1=new Search1();
		search1.searchCom(driver);
		search1.queryName(driver,"杭州有数科技有限公司");
		driver.findElement(By.xpath("//*[@class='query-wrap rel']//button[1]")).click();
		Thread.sleep(5000);*/

        //高级查询操作
        driver.findElement(By.linkText("高级搜索")).click();
        Search2 search2=new Search2();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@class='jc-title']"));
        //注册资本输入
        search2.setRegisterMin(driver, "50");
        search2.setRegisterMax(driver, "500");
        Thread.sleep(1000);
        //成立日期输入
        search2.startTime(driver, "2012-10-01");
        search2.endTime(driver, "2018-10-01");
        Thread.sleep(1000);
        //所属地域选择
        search2.clickRegion1(driver);
        driver.findElement(By.linkText("浙江")).click();
        search2.clickRegion2(driver);
        driver.findElement(By.linkText("杭州市")).click();
        search2.clickRegion3(driver);
        driver.findElement(By.linkText("江干区")).click();
        Thread.sleep(1000);
        //所属行业选择
        search2.clickIndustry1(driver);
        driver.findElement(By.linkText("信息传输、软件和信息技术服务业")).click();
        search2.clickIndustry2(driver);
        driver.findElement(By.linkText("互联网和相关服务")).click();
        search2.clickIndustry3(driver);
        driver.findElement(By.linkText("互联网信息服务")).click();
        search2.clickIndustry4(driver);
        driver.findElement(By.linkText("互联网其他信息服务")).click();
        Thread.sleep(1000);
        //关键字输入
        search2.keyWord1(driver, "杭州知乎");
        driver.findElement(By.xpath("//*[@class='part19']//button[1]")).click();
        //经营状态勾选
//	    search2.Status1(driver);

        //退出操作
        driver.findElement(By.id("userName2")).click();
        Thread.sleep(1000);
        driver.findElement(By.linkText("退出")).click();
        Thread.sleep(1000);


    }
    @AfterMethod
    public void Closed() {
        driver.quit();
    }
}
