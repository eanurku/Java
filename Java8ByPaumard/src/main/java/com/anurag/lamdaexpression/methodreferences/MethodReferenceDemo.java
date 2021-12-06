package com.anurag.lamdaexpression.methodreferences;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceDemo {
    public static void main(String[] args) {


        List<Integer> list= Arrays.asList(1,2,3,4,5,6);
        list.forEach(item-> System.out.print(item));
        System.out.println();
        list.forEach(System.out::print);
    }
}
