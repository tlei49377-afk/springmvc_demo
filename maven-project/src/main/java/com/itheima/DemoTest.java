package com.itheima;

import org.junit.Assert;
import org.junit.Test;

public class DemoTest {
    @Test
    public void testSay(){
        Demo d = new Demo();
        String result = d.say("tommy");
        Assert.assertEquals("hello maven, tommy",result);
        System.out.println(result);

    }
}
