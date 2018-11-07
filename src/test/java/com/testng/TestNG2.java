package com.testng;
//校验用法例子

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG2 {
    //校验a==b
    @Test
    public void assertEqualTest(){
        String a="asdf";
        String b="123ddd";
//        Assert.assertEquals(a,b,"a不等于b");
        Assert.assertEquals(a,b);
    }
    @Test
    public void assertNotEqualTest(){
        int a=1;
        int b=1;
        Assert.assertNotEquals(a,b);
    }
    @Test
    public void assertNullTest(){
        String a=null;
        Assert.assertNull(a);
    }
    @Test
    public void assertNotNullTest(){
        String a="";
        Assert.assertNotNull(a);
    }
}
