package com.anurag.foreachloop;

public class ForEachLoopDemo {

    public static void main(String[] args) {
        int[] values={1,2,3,4,5};
        int sum=0;
        for(int value:values){
            sum+=value;
        }
        System.out.println("sum="+sum);
    }
}
