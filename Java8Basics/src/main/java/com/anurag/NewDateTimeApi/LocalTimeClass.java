package com.anurag.NewDateTimeApi;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeClass {
    public static void main(String[] args) {


        LocalDateTime today= LocalDateTime.now();
        LocalTime time=today.toLocalTime();
        System.out.println(time);

        LocalTime time1= LocalTime.now();
        System.out.println(time);

        LocalTime time2= LocalTime.of(12,23,13);
        System.out.println(time2);

        LocalTime time3= LocalTime.parse("14:22:02");
        System.out.println(time3);


        Duration dur= Duration.between(time2,time3);
        System.out.println(dur);

        LocalTime time4 = time3.plus(dur);
        System.out.println(time4);

    }
}
