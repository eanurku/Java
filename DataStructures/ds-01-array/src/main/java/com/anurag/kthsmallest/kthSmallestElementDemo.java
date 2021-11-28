package com.anurag.kthsmallest;



import java.util.*;

public class kthSmallestElementDemo {

    public static void main(String[] args) {
        int array []=new int[]{1,5,3,2,7,0,9,11};
        int k=4;
        Set<Integer> returnSet = kthSmallestElemnt(array, k);
        System.out.println(returnSet.toArray()[k-1]);
    }

    private static Set<Integer> kthSmallestElemnt(int[] array, int k) {

        Set<Integer> set=new TreeSet<>();

        for (int element: array) {
            set.add(element);
        }


        return set;
    }


}
