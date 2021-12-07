package com.anurag.streamandcollectors._09_collectors;

import com.anurag.models.Person;

import java.util.*;
import java.util.stream.Collectors;

public class GroupbyDemo {
    public static void main(String[] args) {

        List<Person> list2 = new ArrayList<>();
        list2.add(new Person("anurag", 21));
        list2.add(new Person("monu", 17));
        list2.add(new Person("rag", 11));
        list2.add(new Person("aanu", 21));
        list2.add(new Person("abc", 17));
        list2.add(new Person("aksh", 11));

        //groupingBy
        Map<Integer, List<Person>> ageTopersonMap = list2.stream()
                .collect(Collectors.groupingBy(Person::getAge));
        System.out.println(ageTopersonMap);

        System.out.println("==========================================================================");
        //downstream of groupingBy
        Map<Integer, Long> ageToPersonCountMap = list2.stream()
                .collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));
        System.out.println(ageToPersonCountMap);


        System.out.println("==========================================================================");
        //downstream of groupingBy collect as list of names instead of objects
        Map<Integer, List<String>> ageToNameMap = list2.stream()
                .collect(Collectors.groupingBy(Person::getAge,
                        Collectors.mapping(Person::getName,Collectors.toList())


                        )
                );
        System.out.println(ageToNameMap);

        System.out.println("==========================================================================");
        //downstream of groupingBy collect as set of sorted names
        Map<Integer, Set<String>> ageToSortedNameJoinedMap = list2.stream()
                .collect(Collectors.groupingBy(Person::getAge,
                                Collectors.mapping(Person::getName,Collectors.toCollection(TreeSet::new))
                        )
                );
        System.out.println(ageToSortedNameJoinedMap);



        System.out.println("==========================================================================");
        //downstream of groupingBy collect as list of names instead of objects
        Map<Integer, String> ageToNameJoinedMap = list2.stream()
                .collect(Collectors.groupingBy(Person::getAge,
                                Collectors.mapping(Person::getName,Collectors.joining(":"))
                        )
                );
        System.out.println(ageToNameJoinedMap);



    }
}
