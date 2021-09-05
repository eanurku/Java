package com.anurag.mapmethods;

import java.util.EnumMap;
import java.util.Map;

public class MapMethods {
    public static void main(String[] args) {

        Map<TimePeriod, Score> mymap = new EnumMap<>(TimePeriod.class);
        mymap.put(TimePeriod.START,Score.of(0,0));
        mymap.put(TimePeriod.Q1,Score.of(1,1));
        mymap.put(TimePeriod.Q2,Score.of(1,1));
        mymap.put(TimePeriod.Q3,Score.of(2,1));

        System.out.println(mymap);


        mymap.compute(TimePeriod.Q3,(k,v)-> {return Score.of(12,0);});
        System.out.println(mymap);
    }
}
