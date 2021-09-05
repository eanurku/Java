package com.anurag.FunctionalInterface.function;

import java.util.function.Function;

public class FunctionChainingDemo {
    public static void main(String[] args) {

        Function<String, Integer> func1= x->x.length();
        Function<Integer, Integer> func2 = x -> x * x;

        Integer res = func1.andThen(func2).apply("anurag");
        System.out.println(res);
    }
}
