package com.anurag.regex;

import java.util.regex.Pattern;

public class Regex_01_WhitespaceMatching {
    public static void main(String[] args) {

        String regex="this\\s+is\\s+text";
        String input="this is text";

        System.out.println(Pattern.matches(regex,input));
    }
}
