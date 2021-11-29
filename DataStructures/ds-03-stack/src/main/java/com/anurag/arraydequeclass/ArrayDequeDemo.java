package com.anurag.arraydequeclass;

import java.util.ArrayDeque;

public class ArrayDequeDemo {
    public static void main(String[] args) {

        ArrayDeque<Integer> stack=new ArrayDeque<>();

        stack.offerFirst(12);
        stack.offerFirst(44);
        stack.offerFirst(22);
        stack.offerFirst(11);

        System.out.println(stack);

        System.out.println(stack.peekFirst());
        System.out.println(stack.pollFirst());


    }
}
