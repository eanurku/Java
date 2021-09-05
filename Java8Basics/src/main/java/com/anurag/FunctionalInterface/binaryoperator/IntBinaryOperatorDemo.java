package com.anurag.FunctionalInterface.binaryoperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.IntBinaryOperator;

public class IntBinaryOperatorDemo {

    public static void main(String[] args) {
        Integer[] list = { 12, 13, 14, 15 };

        Integer res = findSum(Arrays.asList(list), Integer::sum);
        System.out.println(res);
    }

    private static Integer findSum(List<Integer> list, IntBinaryOperator func) {

        Integer result = null;
        for (Integer item : list) {
            if (result == null) {
                result = item;
            } else {
                result = func.applyAsInt(result, item);
            }

        }
        return result;
    }

}
