package com.anurag.junit.JunitCore;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import static org.junit.Assert.assertEquals;

public class TestJunit {

    @Test
    public void testMethod_1() {
        String str = "test string";
        Assert.assertEquals("test string", str);
    }

    @Test(expected = Throwable.class)
    public void testMethod_2() {
        String str = "test string";
        assertEquals("test string1", str);
    }
}

class TestJunitRunner {

    public static void main(String[] args) {

        Result results = JUnitCore.runClasses(TestJunit.class);
        for (Failure result : results.getFailures()) {

            System.out.println(result);
        }

        System.out.println("Test Was Successfull :" + results.wasSuccessful());

        //System.out.println(System.getProperties());

    }
}


