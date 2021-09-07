package com.anurag.formatspecifier;

public class mixingFlagsDemo {

    public static void main(String[] args) {

        int postvalue=123;
        int negvalue=-123;

        System.out.println(String.format("%(d",postvalue));
        System.out.println(String.format("%(d",negvalue));

        System.out.println("-------------add space padding-------------------");
        System.out.println(String.format("% (d",postvalue));
        System.out.println(String.format("% (d",negvalue));

    }
}
