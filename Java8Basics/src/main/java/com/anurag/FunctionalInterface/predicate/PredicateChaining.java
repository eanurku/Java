package com.anurag.FunctionalInterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateChaining {

    public static void main(String[] args) {
        Integer[] list = { 12, 13, 16, 2, 31, 5, 11 };

        Predicate<Integer> check = x -> x > 10;
        Object[] newList2 = filterList(Arrays.asList(list), check.and(x->x<15)).toArray();
        for (Object item : newList2)
            System.out.println(item);
    }
    private static List<Integer> filterList(List<Integer> asList, Predicate<Integer> check) {
        return asList.stream().filter(check::test).collect(Collectors.toList());
    }
}
