package com.anurag.formatspecifier;

//( : single left parenthesis is used to represent negative number within parenthesis e.g. (123)
public class NegativeNumberInParenthesisDemo {

    public static void main(String[] args) {
        int postvalue=123;
        int negvalue=-123;

        System.out.println(String.format("%(d",postvalue));
        System.out.println(String.format("%(d",negvalue));

    }

}
