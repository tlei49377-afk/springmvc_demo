package com.atguigu.maven;


import org.junit.Test;
import org.junit.Assert;

public class HelloTest {
    @Test
    public void testSayHello(){
        Hello hello = new Hello();
        String result = hello.sayHello("tom");
        Assert.assertEquals("hello maven,tom!",result);
        System.out.println(result);
    }
}
