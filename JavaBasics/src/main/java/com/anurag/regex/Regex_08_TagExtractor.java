package com.anurag.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex_08_TagExtractor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        while(testCases>0){
            String line = in.nextLine();
            String regex="<(.+)>([^<>]+)</(\\1)>";
            Pattern pattern = Pattern.compile(regex);
            Matcher match = pattern.matcher(line);
            if(match.find()){
                System.out.println(match.group(2));
                while(match.find()){
                    System.out.println(match.group(2));

                }
            }else{
                System.out.println("None");
            }
            testCases--;
        }


        }
    }

