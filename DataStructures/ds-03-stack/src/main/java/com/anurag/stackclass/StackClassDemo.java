package com.anurag.stackclass;

import java.util.Stack;

public class StackClassDemo {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.push(14);
        stack.push(16);

        System.out.println(stack.toString());

        System.out.println(stack.isEmpty());
        System.out.println(stack.peek());
        System.out.println(stack.pop());


        //Stack extends Vector so its methods are inherited
        System.out.println(stack.size());
        System.out.println(stack.get(0));
    }
}
