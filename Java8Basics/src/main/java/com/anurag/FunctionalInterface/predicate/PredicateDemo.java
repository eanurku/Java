package com.anurag.FunctionalInterface.predicate;

import java.util.function.Predicate;

public class PredicateDemo {

    public static void main(String[] args) {

        Predicate<Integer> check = x -> x > 10;
        boolean res1 = check.test(12);
        System.out.println(res1);

    }

}
