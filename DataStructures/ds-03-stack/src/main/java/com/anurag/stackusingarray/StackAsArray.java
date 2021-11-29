package com.anurag.stackusingarray;

import java.util.Arrays;


public class StackAsArray {

    private static final int MAX_SIZE = 100;
    int array[] = new int[MAX_SIZE];
    int top = -1;

    public boolean isFull() {
        return top == MAX_SIZE - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int peek() {
        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }
        return array[top];
    }

    public boolean push(int element) {
        if (isFull()) {
            return false;
        }
        top++;
        array[top] = element;

        return true;
    }

    public int pop() {

        if (isEmpty()) {
            return Integer.MIN_VALUE;
        }

        int val = array[top];
        top--;
        return val;
    }


}
