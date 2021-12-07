package com.anurag.streamandcollectors._08_reduction;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args)  {
        Optional<Object> emptyOptional = Optional.empty();

        //empty optional
        //get()
        if (emptyOptional.isPresent()) {
            System.out.println(emptyOptional.get());
        }
        //orElse
        System.out.println(emptyOptional.orElse("empty value"));
        //orElseGet
        System.out.println(emptyOptional.orElseGet(()->"EMPTY"));
        //orElseThrow
        try {
            emptyOptional.orElseThrow(() -> new RuntimeException("ERROR due to empty optional"));
        } catch (Exception e) {
            System.out.println(e);
        }



        System.out.println("-----------------------------------------");
        //null Optional

        Optional<Object> nullOptional = Optional.ofNullable(null);
        System.out.println(nullOptional);
        if(nullOptional.isPresent()){
            System.out.println(nullOptional.get());
        }
        System.out.println(nullOptional.orElse("empty value"));
        System.out.println(emptyOptional.orElseGet(()->"EMPTY"));
        System.out.println("----------------------------------------------");



    }
}
