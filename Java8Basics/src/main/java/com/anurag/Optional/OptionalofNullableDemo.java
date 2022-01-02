package com.anurag.Optional;

import java.util.Optional;

public class OptionalofNullableDemo {
    public static void main(String[] args) {

        //optional get methods
        Optional<Object> nullOptional = Optional.ofNullable(null);
        if(nullOptional.isPresent()){
            System.out.println(nullOptional.get());
        }
        nullOptional.ifPresent((p)-> System.out.println(p));
        System.out.println(nullOptional.orElse(-1));
        System.out.println(nullOptional.orElseGet(()->-1));
        nullOptional.orElseThrow(()-> new RuntimeException("this is custom error"));
    }
}
