package com.anurag.FunctionalInterface.biconsumer;

import java.util.function.BiConsumer;

public class BiConsumerDemo {

    public static void main(String[] args) {
        BiConsumer<Integer, Integer> bicons=(a,b)-> System.out.println(a+b);
        bicons.accept(12,13);

    }
}
