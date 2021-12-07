package com.anurag.streamandcollectors._03_filter;

import com.anurag.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class FilterDemo {
    public static void main(String[] args) {

        //single predicate
        List<Person> list = new ArrayList<>();
        list.add(new Person("anurag", 21));
        list.add(new Person("monu", 17));
        list.add(new Person("rag", 11));
        list.add(new Person("sonu", 19));
        list.add(new Person("chonu", 24));

        Stream<Person> list1 = list.stream().filter(person -> person.getAge() > 20);
        list1.forEach(person -> System.out.println(person));

        System.out.println("-----------------------------");


        //Predicate and operation
        Predicate<Person> p1 = person -> person.getAge() < 20;
        Predicate<Person> p2 = person -> person.getAge() > 15;

        list.stream().filter(p1.and(p2)).forEach(person -> System.out.println(person));

        System.out.println("-------------------------------");
        //Predicate isEqual
        Predicate<Person> p = Predicate.isEqual(new Person("anurag", 21));
        list.stream().filter(p).forEach(person -> System.out.println(person));


    }
}

