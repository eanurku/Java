package com.anurag.Stream;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

interface  MyConsumer<T>{

    void accept(T t);


    default MyConsumer<T> andAnother(MyConsumer<T> other){


        return (T t)->{this.accept(t);other.accept(t);};

    }



 }
public class DefaultMethodsDemo {

    public static void main(String[] args) {

        List<Object> list = new ArrayList<>();
        list.add("and");
        list.add("band");


        MyConsumer<String> lamda = s -> System.out.println(s);
        MyConsumer<String> lamda2 = s -> list.add(s);

        MyConsumer newLamda = lamda.andAnother(lamda2);
        newLamda.accept("anurag");




    }
}
