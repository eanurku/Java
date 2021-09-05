package com.anurag.FunctionalInterface.predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateInFilter {

    public static void main(String[] args) {

        Integer[] list = { 12, 13, 1, 2, 3, 5, 11 };

        Object[] newList1 = filterList(Arrays.asList(list), x -> x > 10).toArray();
        for (Object item : newList1)
            System.out.println(item);
        System.out.println();
        Predicate<Integer> check = x -> x > 10;
        Object[] newList2 = filterList(Arrays.asList(list), check).toArray();
        for (Object item : newList2)
            System.out.println(item);

    }

    private static List<Integer> filterList(List<Integer> asList, Predicate<Integer> check) {
        return asList.stream().filter(check).collect(Collectors.toList());
    }

}
