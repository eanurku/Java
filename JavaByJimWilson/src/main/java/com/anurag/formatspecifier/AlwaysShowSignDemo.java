package com.anurag.formatspecifier;

//+ : plus sign is used to show positive or negative value with its sign always
public class AlwaysShowSignDemo {

    public static void main(String[] args) {

        int positive=123;
        int negative=-123;

        System.out.println(String.format("%+d",positive));
        System.out.println(String.format("%+d",negative));
    }
}
