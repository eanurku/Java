package com.anurag.timeanddate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateDemo {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();
        LocalDate newLocalDate = localDate.plusDays(5);

        System.out.println(localDate);
        System.out.println(newLocalDate);
        System.out.println("----------------------format date using DateTimeFormatter-----------------------------");

        DateTimeFormatter outputFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(localDate.format(outputFormat));

        System.out.println(
                "----------------------any input format will work by using DateTimeFormatter---------------------------------");
        //using input date of user format
        String inputDateString = "22/11/2022";//accepted format by LocalDate parse method
        //localDate=LocalDate.parse(inputDateString);// ERROR :Text '22/11/2022' could not be parsed at index 0
        //System.out.println(localDate);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate mydate = LocalDate.parse(inputDateString, formatter);

        System.out.println(mydate);

    }
}
