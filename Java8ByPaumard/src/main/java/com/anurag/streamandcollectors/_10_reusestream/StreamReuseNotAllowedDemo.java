package com.anurag.streamandcollectors._10_reusestream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamReuseNotAllowedDemo {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> stream1 = list.stream().map(i -> i * 2);



        stream1.forEach(s-> System.out.print(s+" "));

        //stream1 is closed once processed so cant be used again
        stream1.forEach(s-> System.out.print(s+" "));

    }
}
