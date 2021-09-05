package com.anurag.FunctionalInterface.bifunction;

import java.util.function.BiFunction;

public class BiFunctionDemo {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> func = (Integer a, Integer b) -> a + b;
        Integer res = func.apply(12, 13);

        System.out.println(res);
    }


}
