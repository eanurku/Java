package com.anurag.Optional;

import com.anurag.models.Person;

import java.util.Optional;

public class OptionalFetchValuesDemo {
    public static void main(String[] args) {

        //optional get methods
        Optional<Object> optional = Optional.ofNullable(12);
        if(optional.isPresent()){
            System.out.println(optional.get());
        }
        optional.ifPresent((p)-> System.out.println(p));
        System.out.println(optional.orElse(-1));
        System.out.println(optional.orElseGet(()->-1));
        optional.orElseThrow(()-> new RuntimeException("this is custom error"));





    }
}
