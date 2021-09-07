package com.anurag.formatspecifier;

//number after decimal value : decide nos of decimal places in result
public class PrecisionDemo {

    public static void main(String[] args) {
        float floatValue = 32.34924f;
        System.out.println(String.format("float value=%.2f", floatValue));

    }
}
