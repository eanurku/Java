package com.anurag.Optional;

import java.util.Optional;

public class OptionalofDemo {
    public static void main(String[] args) {
        //of method is is not for processing null values
        Optional<Object> optionalValue = Optional.of(null);
        System.out.println(optionalValue);
    }
}
