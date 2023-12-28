package com.anurag.Optional;

import javax.tools.JavaCompiler;
import java.util.Optional;

public class OptionalUses {
    public static void main(String[] args) {

        Integer v1 = null;
        Integer v2 = 4;

        Optional<Integer> val1 = Optional.of(v2);//return null pointer exception if null value passed
        Optional<Integer> val2 = Optional.ofNullable(v1);


       Sum(val1,val2);
    }

    private static void Sum(Optional<Integer> val1, Optional<Integer> val2) {

        System.out.println( val1.get()+val2.orElse(0));

    }
}
