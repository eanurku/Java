package com.anurag.regex;

import java.util.Arrays;
/*
IP address is a string in the form "A.B.C.D", where the value of A, B, C, and D may range from 0 to 255.
Leading zeros are allowed. The length of A, B, C, or D can't be greater than 3.
 */
public class Regex_06_IPAddressValidation {
    public static void main(String[] args) {
        String regex="((([01]?\\d?\\d)|(2[0-4]\\d)|(25[0-5]))(\\.|$)){4}";
        String samples[]={"000.12.12.034","121.234.12.12","23.45.12.56",
                          "I.Am.not.an.ip",".213.123.23.32","666.666.23.23"};

        Arrays.stream(samples).forEach(s-> System.out.println(s.matches(regex)));
    }
}
