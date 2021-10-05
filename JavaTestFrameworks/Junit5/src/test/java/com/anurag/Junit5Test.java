package com.anurag;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class Junit5Test {

    @Test
    public void testExpectedException() {

        Assertions.assertThrows(Exception.class, () -> {
            throw new Exception();
        });
    }

    @Test
    public void testTimeout() {

        Assertions.assertTimeout(Duration.ofMillis(1000), () -> {
            Thread.sleep(11);
        });
    }

    @Test
    public void testEquals() {

        Assertions.assertTrue(4 == 2 + 3, () -> {
            return "number not equal";
        });
    }

    @Test
    public void testAssertAll() {

        List<Integer> list = Arrays.asList(1, 2, 3);

        Assertions.assertAll("assert all",
                () -> Assertions.assertEquals(list.get(0).intValue(), 1),
                () -> Assertions.assertTrue(4 == 2 + 3, () -> "number not equal"),
                () -> Assertions.assertThrows(Exception.class, () -> {
                    throw new Exception("test exception");
                })
        );
    }
}
