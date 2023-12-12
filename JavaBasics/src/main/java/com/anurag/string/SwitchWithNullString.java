package com.anurag.string;

public class SwitchWithNullString {
    public static void main(String[] args) {
        String name=null;
        switch(name){
            case "anu":
                System.out.println("case 1");
                break;
            case "gonu":
                System.out.println("case 2");
                break;
            default:
                System.out.println("print default");
        }
    }
}
