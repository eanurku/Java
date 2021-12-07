package com.anurag.streamandcollectors._08_reduction;

import com.anurag.models.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class AnymatchDemo {

    public static void main(String[] args) {

        //anymatch
        List<String> listOfstrings = Arrays.asList("kanurag", "monu", "sonu", "chonu");
        boolean matchFound = listOfstrings.stream().anyMatch(Predicate.isEqual("kanurag"));
        System.out.println(matchFound);

        List<Person> list3 = new ArrayList<>();
        list3.add(new Person("anurag", 21));
        list3.add(new Person("monu", 17));
        list3.add(new Person("rag", 11));

        boolean matchFound2 = list3.stream().map(person -> person.getAge()).anyMatch(age -> age > 20);
        System.out.println(matchFound2);

    }
}
