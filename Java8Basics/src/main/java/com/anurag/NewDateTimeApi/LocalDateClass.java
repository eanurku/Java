package com.anurag.NewDateTimeApi;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateClass {
    public static void main(String[] args) {


        LocalDateTime today= LocalDateTime.now();

        LocalDate todayDate=today.toLocalDate();
        System.out.println(todayDate);

        LocalDate date= LocalDate.now();
        System.out.println(date);

        LocalDate date2= LocalDate.of(2019, Month.AUGUST,12);
        System.out.println(date2);


        LocalDate date3 = date2.plus(2, ChronoUnit.MONTHS);
        System.out.println(date3);


        LocalDate date4 = date3.plus(2, ChronoUnit.DECADES);
        System.out.println(date4);

        Period period = Period.between(date3, date4);
        System.out.println(period);

        LocalDate date5 = date.plus(period);
        System.out.println(date5);



    }
}
