package com.anurag.commandlineapp;

/**
 * Hello world!
 */
/* run from command line:
   $ java com.anurag.commandlineapp.App anurag "ak kumar"
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        if (args.length < 1) {
            return;
        }
        for (String arg : args) {
            System.out.println(arg);
        }
    }
}
