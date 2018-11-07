package com.testng;
//注解用法例子
import org.testng.annotations.*;

public class TestNG1 {
    @BeforeTest
    public void testCase(){
        System.out.println("这是@BeforeTest注解");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("这是@BeforeMethod注解");
    }
    @Test
    public void testCase1(){
        System.out.println("这是@Test注解1");
    }

    @Test
    public void testCase2(){
        System.out.println("这是@Test注解2");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("这是@AfterMethod注解");
    }
    @AfterTest
    public void afterCase(){
        System.out.println("这是@AfterTest注解");
    }
}
