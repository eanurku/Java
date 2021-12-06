package com.anurag.lamdaexpression.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LambdaExpressionDemo {
    public static void main(String[] args) {
        String[] array = new String[]{"anurag", "pratap", "monu", "abhigyan", "chora"};
        //System.out.println(Arrays.toString(array));

        //natural order
        Arrays.sort(array);
        System.out.println("natural order:" + Arrays.toString(array));

        //reverse of natural order
        Comparator<? super String> sortComparator = new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return -1 * s1.compareTo(s2);
            }
        };
        Arrays.sort(array, sortComparator);
        System.out.println("reverse natural order sort by anonymous class :" + Arrays.toString(array));
        //reverse of natural order by lambda

        Comparator<? super String> sortlambda = (s1, s2) -> s1.compareTo(s2) * -1;
        Arrays.sort(array, sortlambda);
        System.out.println("reverse natural order sort by lambda :" + Arrays.toString(array));


    }

}