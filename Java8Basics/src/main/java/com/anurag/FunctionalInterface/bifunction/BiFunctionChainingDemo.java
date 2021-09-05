package com.anurag.FunctionalInterface.bifunction;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionChainingDemo {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Double> func1 = (x1, x2) -> Math.pow(x1, x2);
        Function<Double, String> func2 = x1 -> "result:" + x1.toString();
        String res = func1.andThen(func2).apply(2, 3);

        System.out.println(res);

    }
}
