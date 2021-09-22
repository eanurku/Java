package com.anurag.formatspecifier;

//0 : zero used for padding with 0 for a empty position in given width
public class ZeroPaddingDemo {

    public static void main(String[] args) {

        int x=23,y=23764;
        int a=1,b=124432532;

        System.out.println(String.format("x=%d,y=%d",x,y));
        System.out.println(String.format("a=%d,b=%d",a,b));

        System.out.println("------------adding width--------------------");
        System.out.println(String.format("x=%4d,y=%4d",x,y));
        System.out.println(String.format("a=%4d,b=%4d",a,b));

        System.out.println("--------------adding zero-padding------------------");
        System.out.println(String.format("x=%04d,y=%04d",x,y));
        System.out.println(String.format("a=%04d,b=%04d",a,b));
    }
}
