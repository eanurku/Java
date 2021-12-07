package com.anurag.streamandcollectors._05_intermediaryandterminal;

import com.anurag.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class FinalOperationDemo {
    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("anurag", 21));
        list1.add(new Person("monu", 17));
        list1.add(new Person("anurag", 21));
        list1.add(new Person("monu", 17));
        list1.add(new Person("rag", 11));

        //intermediary operation do not trigger processing of data in stream
        Stream<Person> output = list1.stream().filter(person -> {
            System.out.println("check if i am called");
            return person.getAge() > 20;});


        System.out.println("-----------------------------");

        //final operation trigger processing of data by stream

        output.forEach(person -> System.out.println(person));


    }
}
