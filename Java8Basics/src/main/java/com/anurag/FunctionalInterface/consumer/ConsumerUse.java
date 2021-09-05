package com.anurag.FunctionalInterface.consumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerUse {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(new Integer[] { 12, 13, 14, 15 });
        Consumer<Integer> consumer = item -> System.out.println(item);
        foreach(list,consumer::accept);
    }

    private static void foreach(List<Integer> list, Consumer<Integer> consumer) {

        for(Integer item:list){
            consumer.accept(item);
        }
    }

}
