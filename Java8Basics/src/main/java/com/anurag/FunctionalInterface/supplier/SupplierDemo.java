package com.anurag.FunctionalInterface.supplier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {
        Supplier<LocalDateTime> datetime=()-> LocalDateTime.now();
        System.out.println(datetime.get());

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:SS");
        Supplier<String> datetimeformatted = () -> formatter.format(LocalDateTime.now());
        System.out.println(datetimeformatted.get());


    }

}
