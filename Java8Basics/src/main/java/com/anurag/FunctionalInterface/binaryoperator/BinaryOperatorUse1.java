package com.anurag.FunctionalInterface.binaryoperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class BinaryOperatorUse1 {

    public static void main(String[] args) {
        Integer[] list = { 12, 13, 14, 15, 16 };

        BinaryOperator<Integer> func1 = (x1, x2) -> x1 + x2;

        Integer res1 = addNumbers(Arrays.asList(list), 0, func1);
        System.out.println(res1);

        BinaryOperator<Integer> func2 = Integer::sum;
        Integer res2 = addNumbers(Arrays.asList(list), 0, func2);
        System.out.println(res2);


    }

    private static Integer addNumbers(List<Integer> list, int initial, BinaryOperator<Integer> adder) {

        int res = initial;
        for (Integer item : list) {
            res=adder.apply(res,item);
        }
        return res;
    }

}
