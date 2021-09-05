package com.anurag.FunctionalInterface.binaryoperator;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorDemo {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> func1 = (x1, x2) -> x1 + x2;
        Integer res = func1.apply(23, 12);
        System.out.println(res);

        BinaryOperator<Integer> func2 = (x1, x2) -> x1 + x2;
        Integer res2 = func2.apply(23, 12);
        System.out.println(res2);

    }

}
