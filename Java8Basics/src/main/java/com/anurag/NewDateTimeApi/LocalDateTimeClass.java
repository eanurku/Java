package com.anurag.NewDateTimeApi;

import java.time.LocalDateTime;

public class LocalDateTimeClass {

    public static void main(String[] args) {

        LocalDateTime today= LocalDateTime.now();
        System.out.println(today);

        LocalDateTime d1=today.withYear(2019).withMonth(12);
        System.out.println(d1);


    }
}
