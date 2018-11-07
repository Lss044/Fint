package httpfan.cases;

import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search2 {
    public Search2() {

    }
    //定位注册资本
    public void setRegisterMin(WebDriver driver, String registerMin) {
        WebElement registermin=driver.findElement(By.xpath("//*[@class='part11_3']//input[1]"));
        registermin.sendKeys(registerMin);
    }
    public void setRegisterMax(WebDriver driver,String registerMax) {
        WebElement registermax=driver.findElement(By.xpath("//*[@class='part11_5']//input[1]"));
//        registermax.click();
        registermax.sendKeys(registerMax);
    }
    //定位成立时间
    public void startTime(WebDriver driver,String startTime) {
        WebElement starttime=driver.findElement(By.id("startTime"));
        starttime.sendKeys(startTime);
        starttime.sendKeys(Keys.TAB);
    }
    public void endTime(WebDriver driver,String endTime) {
        WebElement endtime=driver.findElement(By.id("endTime"));
        endtime.sendKeys(endTime);
        endtime.sendKeys(Keys.ENTER);
    }
    //定位所属地域
    public void clickRegion1(WebDriver driver){
        WebElement clickregion1=driver.findElement(By.xpath("//*[@class='part12']//li[1]//button[1]"));
        clickregion1.click();
    }
    public void clickRegion2(WebDriver driver){
        WebElement clickregion2=driver.findElement(By.xpath("//*[@class='part12']//li[2]//button[1]"));
        clickregion2.click();
    }
    public void clickRegion3(WebDriver driver){
        WebElement clickregion3=driver.findElement(By.xpath("//*[@class='part12']//li[3]//button[1]"));
        clickregion3.click();
    }
    //定位所属行业
    public void clickIndustry1(WebDriver driver){
        WebElement clickindustry1=driver.findElement(By.xpath("//*[@class='part14']//li[1]//button[1]"));
        clickindustry1.click();
    }
    public void clickIndustry2(WebDriver driver){
        WebElement clickindustry2=driver.findElement(By.xpath("//*[@class='part14']//li[2]//button[1]"));
        clickindustry2.click();
    }
    public void clickIndustry3(WebDriver driver){
        WebElement clickindustry3=driver.findElement(By.xpath("//*[@class='part14']//li[3]//button[1]"));
        clickindustry3.click();
    }
    public void clickIndustry4(WebDriver driver){
        WebElement clickindustry4=driver.findElement(By.xpath("//*[@class='part14']//li[4]//button[1]"));
        clickindustry4.click();
    }
    //定位更多条件
    public void moreCondtion1(WebDriver driver){
        WebElement morecondition1=driver.findElement(By.xpath("//*[@class='part15']//li[1]//button[1]"));
        morecondition1.click();
    }
    public void moreCondtion2(WebDriver driver){
        WebElement morecondition2=driver.findElement(By.xpath("//*[@class='part15']//li[2]//button[1]"));
        morecondition2.click();
    }
    public void moreCondtion3(WebDriver driver){
        WebElement morecondition3=driver.findElement(By.xpath("//*[@class='part15']//li[3]//button[1]"));
        morecondition3.click();
    }
    public void moreCondtion4(WebDriver driver){
        WebElement morecondition4=driver.findElement(By.xpath("//*[@class='part15']//li[4]//button[1]"));
        morecondition4.click();
    }
    public void moreCondtion5(WebDriver driver){
        WebElement morecondition5=driver.findElement(By.xpath("//*[@class='part15']//li[5]//button[1]"));
        morecondition5.click();
    }
    public void moreCondtion6(WebDriver driver){
        WebElement morecondition6=driver.findElement(By.xpath("//*[@class='part15']//li[6]//button[1]"));
        morecondition6.click();
    }
    public void moreCondtion7(WebDriver driver){
        WebElement morecondition7=driver.findElement(By.xpath("//*[@class='part15']//li[7]//button[1]"));
        morecondition7.click();
    }
    public void moreCondtion8(WebDriver driver){
        WebElement morecondition8=driver.findElement(By.xpath("//*[@class='part15']//li[8]//button[1]"));
        morecondition8.click();
    }
    //定位关键字
    public void keyWord1(WebDriver driver,String keyWord1){
        WebElement keyword1=driver.findElement(By.xpath("//*[@class='part17_21']"));
        keyword1.sendKeys(keyWord1);
    }
    public void keyWord2(WebDriver driver,String keyWord2){
        WebElement keyword2=driver.findElement(By.xpath("//*[@class='part17_22']"));
        keyword2.sendKeys(keyWord2);
    }
    public void keyWord3(WebDriver driver,String keyWord3){
        WebElement keyword3=driver.findElement(By.xpath("//*[@class='part17_23']"));
        keyword3.sendKeys(keyWord3);
    }
    public void keyWord4(WebDriver driver,String keyWord4){
        WebElement keyword4=driver.findElement(By.xpath("//*[@class='part17_24']"));
        keyword4.sendKeys(keyWord4);
    }
    public void keyWord5(WebDriver driver,String keyWord5){
        WebElement keyword5=driver.findElement(By.xpath("//*[@class='part17_25']"));
        keyword5.sendKeys(keyWord5);
    }
    public void keyWord6(WebDriver driver,String keyWord6){
        WebElement keyword6=driver.findElement(By.xpath("//*[@class='part17_26']"));
        keyword6.sendKeys(keyWord6);
    }
    //定位经营状态
    public void Status1(WebDriver driver){
        WebElement status1=driver.findElement(By.xpath("//*[@id='operate_all']"));
        status1.click();
    }
}
