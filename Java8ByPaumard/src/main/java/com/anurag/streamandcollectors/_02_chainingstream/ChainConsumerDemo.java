package com.anurag.streamandcollectors._02_chainingstream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ChainConsumerDemo {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("anu","gonu","conu","donu");


        List<String> list=new ArrayList<>();

        Consumer<String> c1=s-> System.out.println(s);
        Consumer<String> c2=s->list.add(s);

        names.stream().forEach(c1.andThen(c2));

        System.out.println(list);

    }
}
