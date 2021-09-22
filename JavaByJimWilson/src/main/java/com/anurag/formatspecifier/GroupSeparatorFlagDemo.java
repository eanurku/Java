package com.anurag.formatspecifier;

// , : comma act as group separator
public class GroupSeparatorFlagDemo {

    public static void main(String[] args) {
        int intValue=19812354;
        float floatValue=1234212.34f;

        System.out.println(String.format("%,d",intValue));
        System.out.println(String.format("%,f",floatValue));

    }
}
