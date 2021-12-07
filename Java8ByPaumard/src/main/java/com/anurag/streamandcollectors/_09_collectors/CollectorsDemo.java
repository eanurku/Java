package com.anurag.streamandcollectors._09_collectors;

import com.anurag.models.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<String> strings= Arrays.asList("anurag  ","  monu","  gonu");

        //Collectors.joining(delimeter) for string only
        String result = strings.stream().map(string -> string.trim()).collect(Collectors.joining(","));
        System.out.println(result);

        System.out.println("==========================================================================");
        //Collectors.toList()
        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("anurag", 21));
        list1.add(new Person("monu", 17));
        list1.add(new Person("rag", 11));

        List<Integer> ageList = list1.stream().map(person -> person.getAge()).collect(Collectors.toList());
        System.out.println(ageList);




    }
}
