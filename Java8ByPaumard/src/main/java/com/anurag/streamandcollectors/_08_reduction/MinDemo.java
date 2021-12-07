package com.anurag.streamandcollectors._08_reduction;

import java.util.*;

public class MinDemo {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 2, 3, 4, 5, 6);
        //min
        OptionalInt min = list.stream().mapToInt(item -> item * item).min();
        System.out.println(min.orElseGet(() -> -1));

        //min with natural comparator
        List<String> listOfstrings = Arrays.asList("kanurag", "monu", "sonu", "chonu");
        Optional<String> minString = listOfstrings.stream().min(Comparator.naturalOrder());
        System.out.println(minString.orElseGet(() -> "invalid"));


    }
}
