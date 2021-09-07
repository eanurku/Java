package com.anurag.readinput;

import java.util.Scanner;

public class ScannerInputDemo {

    public static void main(String[] args) {
        System.out.println("enter two values for sum");

        Scanner scanner=new Scanner(System.in);
        String userInput = scanner.nextLine();
        String[] input = userInput.split(" ");

        int sum=Integer.parseInt(input[0])+Integer.parseInt(input[1]);
        System.out.println("sum="+sum);

    }
}
