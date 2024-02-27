package com.anurag.regex;


import java.util.regex.Pattern;

public class Regex_04_NegativeLookAhead {
    public static void main(String[] args) {

        String regex="a(?!b)";
        String sample="a";

        System.out.println(Pattern.matches(regex,sample));
    }
}
