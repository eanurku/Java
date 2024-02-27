package com.anurag.regex;

public class Regex_03_Grouping {
    public static void main(String[] args) {
        String regex="(\\w)(\\s+)([,\\.])";
        String sample="this is valid  ,but i can chage it  .";

        String sample2 = sample.replaceAll(regex, "$1$3");

        System.out.println(sample);
        System.out.println(sample2);
    }

}
