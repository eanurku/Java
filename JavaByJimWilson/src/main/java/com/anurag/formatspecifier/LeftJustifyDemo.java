package com.anurag.formatspecifier;

// - : hyphen used to left justify,default is right justify
public class LeftJustifyDemo {

    public static void main(String[] args) {

        int x=23,y=23764;
        int a=1,b=124432532;

        System.out.println(String.format("x=%d,y=%d",x,y));
        System.out.println(String.format("a=%d,b=%d",a,b));

        System.out.println("------------adding width--------------------");
        System.out.println(String.format("x=%4d,y=%4d",x,y));
        System.out.println(String.format("a=%4d,b=%4d",a,b));

        System.out.println("--------------adding left justify------------------");
        System.out.println(String.format("x=%-4d,y=%-4d",x,y));
        System.out.println(String.format("a=%-4d,b=%-4d",a,b));

        System.out.println("--------------zero padding with left justify not allowed------------------");
        System.out.println(String.format("x=% -4d,y=%- 4d",x,y));
        System.out.println(String.format("a=%- 4d,b=%- 4d",a,b));
    }
}
