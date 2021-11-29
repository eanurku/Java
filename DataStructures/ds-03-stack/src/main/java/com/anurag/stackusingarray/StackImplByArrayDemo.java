package com.anurag.stackusingarray;

public class StackImplByArrayDemo {
    public static void main(String[] args) {

        StackAsArray stack=new StackAsArray();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.peek());

        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        System.out.println(stack.peek());

    }
}
