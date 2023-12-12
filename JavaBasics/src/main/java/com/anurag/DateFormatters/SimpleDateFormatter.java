package com.anurag.DateFormatters;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatter {

    public static void main(String[] args) throws ParseException {

        Date date = new Date();
        System.out.println(date);

        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/YYYY'T'HH:mm:ss");
        System.out.println(formatter1.format(date));


        SimpleDateFormat formattter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
        String dateString = formattter.format(date);
        System.out.println(dateString);

        Date newdate = formattter.parse(dateString);
        System.out.println(newdate.toString());
        System.out.println("-----------------------------------------------------------------");

        SimpleDateFormat formatter2=new SimpleDateFormat("dd-mm-yyyy");
        String dateString2 = formatter2.format(date);
        System.out.println(dateString2);

        System.out.println(formatter2.parse(dateString2));




    }
}
