package com.anurag.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputOutput {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String name="";
        while(!(name=reader.readLine()).equalsIgnoreCase("STOP")){
            System.out.println("data=="+name);
        }

    }
}
