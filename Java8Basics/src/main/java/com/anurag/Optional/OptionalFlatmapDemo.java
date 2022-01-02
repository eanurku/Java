package com.anurag.Optional;

import java.util.Optional;

public class OptionalFlatmapDemo {
    public static void main(String[] args) {

        System.out.println("------------------------------------------------");
        //map
        Optional<String> test = Optional.ofNullable("test");
        Optional<Integer> testval = test.map(item -> item.length());
        System.out.println(testval);

        //map will convert result to Optional by default while returning
        Optional<String> test1 = Optional.ofNullable("test 1");
        Optional<Optional<Integer>> test1val = test1.map(item -> Optional.ofNullable(item.length()));
        System.out.println(test1val);

        //flatmap will not convert result to Optinal by default
        Optional<String> test2 = Optional.ofNullable("flatmap test");
        Optional<Integer> test2val = test2.flatMap(item -> Optional.ofNullable(item.length()));
        System.out.println(test2val);


    }
}
