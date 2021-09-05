package com.anurag.FunctionalInterface.biconsumer;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumerUse {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1,"cpp");
        map.put(12,"java");
        map.put(13,"c");
        BiConsumer<Integer, String> bicons = (a, b) -> System.out.println(a + " : " + b);
        forEachMethod(map,bicons);


    }

    private static void forEachMethod(Map<Integer, String> map, BiConsumer<Integer, String> bi) {

        for(Map.Entry<Integer, String> entry:map.entrySet()){
            bi.accept(entry.getKey(),entry.getValue());
        }

    }

}
