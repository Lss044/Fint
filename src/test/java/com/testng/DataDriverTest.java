package com.testng;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriverTest {
    @DataProvider(name = "login")
    public Object[][] data1(){
        return new Object[][]{{"user1","pwd1"},
        {"user2","pwd2"}};
    }
    @Test(dataProvider="login")
    public void loginTest(String user,String passsword){
        System.out.println("user"+user);
        System.out.println("password"+passsword);
    }

}
