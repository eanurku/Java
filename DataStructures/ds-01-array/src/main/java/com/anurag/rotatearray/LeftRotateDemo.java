package com.anurag.rotatearray;

import java.util.Arrays;

public class LeftRotateDemo {
    public static void main(String[] args) {
        int array[] = new int[]{1, 2, 3, 4, 5, 6, 7};
        int nuberofRotation = 2;
        leftRotate(array, nuberofRotation);
        System.out.println(Arrays.toString(array));
    }

    private static void leftRotate(int[] array, int nuberOfRotation) {
        for (int rotationCount = 0; rotationCount < nuberOfRotation; rotationCount++) {

            int leftMostValue = array[0];
            int index;
            for (index = 0; index < array.length - 1; index++) {

                array[index] = array[index + 1];

            }
            array[index] = leftMostValue;

        }



    }

}
