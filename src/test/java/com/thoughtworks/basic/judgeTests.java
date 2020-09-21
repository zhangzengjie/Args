package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

public class judgeTests {

    @Test
    public void judgeInteger(){
        boolean test = Schema.judgeInteger("83");
        Assert.assertEquals(test,true);
    }

    @Test
    public void judgeString(){
        boolean test = Schema.judgeString("asd");
        Assert.assertEquals(test,true);
    }
}
