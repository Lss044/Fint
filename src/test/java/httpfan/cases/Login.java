package httpfan.cases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Login {
    public Login() {

    }

    public void setUserName(WebDriver driver, String userName) {

        WebElement username=driver.findElement(By.xpath("//*[@id='username']"));
        username.clear();
        username.sendKeys(userName);
    }
    public void setPassWord(WebDriver driver,String passWord){

        WebElement password=driver.findElement(By.xpath("//*[@id='password']"));
        password.clear();
        password.sendKeys(passWord);
    }
    public void clickLogin(WebDriver driver){
        WebElement loginbtn=driver.findElement(By.xpath("//*[@id='login_btn']"));
        loginbtn.click();
    }
}
