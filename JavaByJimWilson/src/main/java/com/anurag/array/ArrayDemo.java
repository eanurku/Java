package com.anurag.array;

public class ArrayDemo {

    public static void main(String[] args) {

        int[] intValues = new int[10];
        intValues[0] = 11;
        intValues[1] = 22;
        intValues[2] = 33;

        int sum = 0;
        for (int index = 0; index < intValues.length; index++) {
            sum += intValues[index];
        }
        System.out.println("sum=" + sum);


        int[] vals={11,12,13};
        sum=0;
        for (int index = 0; index < vals.length; index++) {
            sum += vals[index];
        }
        System.out.println("sum=" + sum);
    }

}
