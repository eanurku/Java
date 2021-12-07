package com.anurag.streamandcollectors._08_reduction;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class ReduceDemo {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);

        //reduce(accumulator)
        Optional<Integer> result = list.stream().reduce((a, b) -> a + b);
        Integer resultValue = result.orElse(-1);
        System.out.println(resultValue);

        //reduce(identity,accumulator)
        Integer result2 = list.stream().reduce(0, (a, b) -> a + b);
        System.out.println(result2);
    }
}
