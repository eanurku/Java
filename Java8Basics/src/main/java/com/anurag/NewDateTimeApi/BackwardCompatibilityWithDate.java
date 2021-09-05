package com.anurag.NewDateTimeApi;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

public class BackwardCompatibilityWithDate {
    public static void main(String[] args) {


        Date date=new Date();
        System.out.println(date);

        Instant ins = date.toInstant();


        LocalDateTime today= LocalDateTime.ofInstant(ins, ZoneId.systemDefault());
        System.out.println(today);

        ZonedDateTime zonetime= ZonedDateTime.ofInstant(ins, ZoneId.systemDefault());
        System.out.println(zonetime);
    }
}
