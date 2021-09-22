package com.anurag.formatspecifier;

//# : display base of number
public class RedixFlagDemo {

    public static void main(String[] args) {
        int intvalue=32;
        //System.out.println(String.format("%#d",intvalue)); # does not work with %d
        System.out.println(String.format("%#x",intvalue));
        System.out.println(String.format("%#X",intvalue));
        System.out.println(String.format("%#o",intvalue));
    }

}
