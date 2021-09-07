package com.anurag.formatspecifier;

public class FormatSpecifierDemo {

    public static void main(String[] args) {

        int intValue=32;
        System.out.println(String.format("decimal value=%d",intValue));
        System.out.println(String.format("hexadecimal value=%x",intValue));
        System.out.println(String.format("hexadecimal value=%X",intValue));

        System.out.println("------------------------------------------------");
        float floatValue=123.34f;
        System.out.println(String.format("float value=%f",floatValue));
        System.out.println(String.format("float value=%e",floatValue));
        System.out.println(String.format("float value=%E",floatValue));
    }
}
