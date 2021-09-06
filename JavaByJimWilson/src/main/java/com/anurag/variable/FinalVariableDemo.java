package com.anurag.variable;

public class FinalVariableDemo {

    public static void main(String[] args) {

        final int id=11;
       // id=13; this will give error
        System.out.println(id);

        final int newId;
        newId=23;

        //newId=33; this will give error
        System.out.println(newId);
    }

}
