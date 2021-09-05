package com.anurag.MethodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SampleExample {

    void printmethod(String s){
        System.out.println(s);
    }
    public static void main(String[] args) {


        List<String> list = new ArrayList<>();
        list.add("anurag");
        list.add("monu");
        list.add("sonu");

        //reference to static method
        list.forEach(System.out::println);
        System.out.println();
        //reference to instance method
        SampleExample sample=new SampleExample();
        list.forEach(sample::printmethod);

        String str=null;
        String value = Optional.ofNullable(str).orElseThrow(NullPointerException::new);


    }
}
