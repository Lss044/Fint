package httpfan.cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Search1 {
    public Search1() {

    }
    //定位全部下查询
    public void searchAll(WebDriver driver) {
        WebElement searchall=driver.findElement(By.xpath("//*[@id='queryRangeList']/li[1]"));
        searchall.click();
    }
    //定位企业名称下查询
    public void searchCom(WebDriver driver) {
        WebElement searchcom=driver.findElement(By.xpath("//*[@id='queryRangeList']/li[2]"));
        searchcom.click();
    }
    //定位法人代表下查询
    public void searchPil(WebDriver driver) {
        WebElement searchpil=driver.findElement(By.xpath("//*[@id='queryRangeList']/li[3]"));
        searchpil.click();
    }
    //定位股东下查询
    public void searchPar(WebDriver driver) {
        WebElement searchpar=driver.findElement(By.xpath("//*[@id='queryRangeList']/li[4]"));
        searchpar.click();
    }
    //定位主要成员下查询
    public void searchMan(WebDriver driver) {
        WebElement searchman=driver.findElement(By.xpath("//*[@id='queryRangeList']/li[5]"));
        searchman.click();
    }
    //定位查询输入框
    public void queryName(WebDriver driver,String queryName) {
        WebElement queryname=driver.findElement(By.xpath("//*[@id='queryInput']"));
        queryname.clear();
        queryname.sendKeys(queryName);
    }
}
