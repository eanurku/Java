package com.anurag.regex;

import java.util.regex.Pattern;

public class Regex_05_Backreferences {
    public static void main(String[] args) {

        String regex="(\\d\\d)\\1";
        String sample="1212";
        String sample2="1234";

        System.out.println(Pattern.matches(regex,sample));
        System.out.println(Pattern.matches(regex,sample2));
    }
}
