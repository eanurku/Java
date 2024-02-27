package com.anurag.regex;

import java.util.Arrays;

public class Regex_07_DuplicateWordsRemoval {
    public static void main(String[] args) {
        String regex="(?i)\\b(\\w+)(\\s+\\1)+\\b";
        String samples="i love Love to To tO do coding.";

        samples.replaceAll(regex,"$1");
        System.out.println(samples.replaceAll(regex,"$1"));
    }
}
