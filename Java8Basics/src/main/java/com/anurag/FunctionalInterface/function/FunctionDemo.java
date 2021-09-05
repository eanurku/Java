package com.anurag.FunctionalInterface.function;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {

        Function<String, Integer> func=x->x.length();
        Integer res = func.apply("anurag");

        System.out.println(res);
    }
}
