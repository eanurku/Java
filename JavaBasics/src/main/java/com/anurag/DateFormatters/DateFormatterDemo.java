package com.anurag.DateFormatters;


import java.text.DateFormat;
import java.util.Date;

public class DateFormatterDemo {


    public static void main(String[] args) {

        Date date=new Date();

        System.out.println(date);

        DateFormat dateFormatter = DateFormat.getDateInstance(DateFormat.SHORT);
        System.out.println(dateFormatter.format(date));

        DateFormat timeFormatter=DateFormat.getTimeInstance(DateFormat.SHORT);
        System.out.println(timeFormatter.format(date));

        DateFormat dateTimeFormatter = DateFormat.getDateTimeInstance(DateFormat.SHORT,DateFormat.SHORT);
        System.out.println(dateTimeFormatter.format(date));


    }


}
