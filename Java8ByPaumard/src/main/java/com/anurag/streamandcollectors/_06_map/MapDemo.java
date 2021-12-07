package com.anurag.streamandcollectors._06_map;

import com.anurag.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapDemo {
    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("anurag", 21));
        list1.add(new Person("monu", 17));
        list1.add(new Person("rag", 11));

        //map operation take Function
        Stream<Integer> persons = list1.stream().map(person -> person.getAge());
        persons.forEach(age-> System.out.println(age));


    }
}
