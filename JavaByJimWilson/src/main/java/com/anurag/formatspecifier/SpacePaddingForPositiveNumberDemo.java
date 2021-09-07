package com.anurag.formatspecifier;

//space is used to provide padding on positive value
public class SpacePaddingForPositiveNumberDemo {

    public static void main(String[] args) {
        int postValue=123;
        int negValue=-123;

        System.out.println(String.format("% d",postValue));
        System.out.println(String.format("% d",negValue));

    }
}
