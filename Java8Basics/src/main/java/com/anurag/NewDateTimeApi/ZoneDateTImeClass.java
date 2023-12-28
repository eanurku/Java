package com.anurag.NewDateTimeApi;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTImeClass {
    public static void main(String[] args) {

        ZonedDateTime time=ZonedDateTime.now();
        System.out.println(time);

        ZoneId id = ZoneId.of(ZoneId.SHORT_IDS.get("ECT"));
        System.out.println(id);
    }
}
