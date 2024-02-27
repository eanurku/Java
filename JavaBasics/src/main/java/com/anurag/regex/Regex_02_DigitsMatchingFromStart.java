package com.anurag.regex;

public class Regex_02_DigitsMatchingFromStart {
    public static void main(String[] args) {

        String sample1="123 444";
        String sample2="123444";

        String regex="^\\d+";

        System.out.println(sample1.matches(regex));
        System.out.println(sample2.matches(regex));


    }
}
