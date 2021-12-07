package com.anurag.streamandcollectors._01_buildingstream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class CreateStreamDemo {

    public static void main(String[] args) {

        //stream() method on collection
        List<Integer> listofIntegers= Arrays.asList(1,2,3,4,5);
        Stream<Integer> stream = listofIntegers.stream();
        System.out.println(stream);
        System.out.println(stream.count());

        System.out.println("---------------------------------");

        //Stream.of() method
        Stream<Integer> secondStream = Stream.of(1, 2, 3, 4, 5);
        secondStream.forEach(s-> System.out.print(s+" "));

        System.out.println("\n-------------------------------------");


        //Stream.empty() method
        Stream<Object> emptyStream = Stream.empty();
        emptyStream.forEach(s-> System.out.println(s));





    }
}
