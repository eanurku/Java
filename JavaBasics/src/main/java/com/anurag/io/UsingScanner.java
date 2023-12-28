package com.anurag.io;

import java.util.Scanner;

public class UsingScanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNext()){
            System.out.println( scanner.nextInt());
        }


    }
}
