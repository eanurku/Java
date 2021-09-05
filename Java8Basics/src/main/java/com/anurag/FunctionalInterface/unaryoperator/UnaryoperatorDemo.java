package com.anurag.FunctionalInterface.unaryoperator;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryoperatorDemo {

    public static void main(String[] args) {
        Function<Integer, Integer> func1=x->x*2;
        Integer res1 = func1.apply(12);
        System.out.println(res1);

        UnaryOperator<Integer> func2=x->x*2;
        Integer res2 = func1.apply(12);
        System.out.println(res2);
    }

}
