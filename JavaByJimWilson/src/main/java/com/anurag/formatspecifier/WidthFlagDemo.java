package com.anurag.formatspecifier;

//number: number is used to specify  minimum width for variable(right justification default)
public class WidthFlagDemo {

    public static void main(String[] args) {

        int x=23,y=23764;
        int a=1,b=124432532;

        System.out.println(String.format("x=%d,y=%d",x,y));
        System.out.println(String.format("a=%d,b=%d",a,b));

        System.out.println("------------adding width--------------------");
        System.out.println(String.format("x=%4d,y=%4d",x,y));
        System.out.println(String.format("a=%4d,b=%4d",a,b));

    }
}
