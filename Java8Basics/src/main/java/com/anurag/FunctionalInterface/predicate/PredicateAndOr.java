package com.anurag.FunctionalInterface.predicate;

import java.util.function.Predicate;

public class PredicateAndOr {

    public static void main(String[] args) {
        Predicate<String> startCheck=str->str.startsWith("A");
        Predicate<String> endCheck=str->str.endsWith("S");

        boolean res = startCheck.and(endCheck).test("AnuragS");
        System.out.println(res);

    }

}
