package com.anurag.arrays;

import java.util.Arrays;

public class ArraysClassDemo {
    public static void main(String[] args) {
        int [] array=new int[]{1,2,3,4,5,6};

        System.out.println(Arrays.toString(array));
        Arrays.stream(array).forEach(System.out::println);
        System.out.println(Arrays.stream(array));
    }
}
