package com.anurag.LamdaExpression;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaAsReplacementForAnonymousClass {

    public static void main(String[] args) {

        List<String> list=new ArrayList<>();
        list.add("monu");
        list.add("sonu");
        list.add("anu");

        //before lambda
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        System.out.println();

        //After  lambda
        list.forEach(s-> System.out.println(s));
        list.forEach(System.out::println);

    }
}
