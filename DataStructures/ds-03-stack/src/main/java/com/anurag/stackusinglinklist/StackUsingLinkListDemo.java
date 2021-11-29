package com.anurag.stackusinglinklist;

public class StackUsingLinkListDemo {
    public static void main(String[] args) {
        StackAsLinkList<Integer> stack =new StackAsLinkList<>();
        stack.push(12);
        stack.push(33);
        stack.push(55);


        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


        System.out.println(stack.pop());


        System.out.println(stack.isEmpty());
    }
}
