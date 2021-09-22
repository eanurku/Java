package com.anurag.logicaloperator;

public class LogicalOperatorsDemo {

    public static void main(String[] args) {
        int num1=100;
        int divisor1=10;
        if(divisor1 !=0 & num1/divisor1 >=10){
            System.out.println("num1/divisor1 is > 10");
        }

        int num2=100;
        int divisor2=0;

        //this & use will give error as both exp will be evaluated always
//        if(divisor2 !=0 & num2/divisor2 >=10){
//            System.out.println("standard logical operator: num2/divisor2 is > 10");
//        }

        if(divisor2 !=0 && num2/divisor2 >=10){
            System.out.println("conditional logical operator: num2/divisor2 is > 10");
        }
    }
}
