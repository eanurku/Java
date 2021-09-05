package com.anurag.FunctionalInterface.bipredicate;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

    public static void main(String[] args) {
        BiPredicate<String, Integer> bicheck=(str,len)->str.length()==len;

        System.out.println(bicheck.test("anurag",6));
        System.out.println(bicheck.test("anurag",5));
        System.out.println(bicheck.test("anura",5));
    }

}
