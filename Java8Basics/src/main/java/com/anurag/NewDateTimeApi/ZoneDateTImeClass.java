package com.anurag.NewDateTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTImeClass {
    public static void main(String[] args) {

        ZonedDateTime zonetime= ZonedDateTime.now();
        System.out.println(zonetime);

        ZoneId zoneId= ZoneId.systemDefault();
        System.out.println(zoneId);

        ZoneId zid= ZoneId.of("Europe/Paris");
        System.out.println(zid);
    }
}
