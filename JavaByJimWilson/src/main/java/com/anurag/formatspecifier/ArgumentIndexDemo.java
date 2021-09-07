package com.anurag.formatspecifier;

//[number]$ : 3$,4$ etc used to refer to 3rd,4th index
//index start from 1
// < : less than symbol is used to apply  previous argument index on current also.
public class ArgumentIndexDemo {

    public static void main(String[] args) {
        int x=100,y=200,z=300;

        System.out.println(String.format("%d %d %d",x,y,z));

        System.out.println("-----------------add n$ for argument index--------------------");
        System.out.println(String.format("%3$d %2$d %1$d",x,y,z));

        System.out.println("-----------------add < to apply previous argument index--------------------");
        System.out.println(String.format("%3$d %<d %<d",x,y,z));
    }
}
