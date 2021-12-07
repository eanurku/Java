package com.anurag.streamandcollectors._07_flatmap;

import com.anurag.models.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FlatMapDemo {
    public static void main(String[] args) {

        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("anurag", 21));
        list1.add(new Person("monu", 17));

        List<Person> list2 = new ArrayList<>();
        list2.add(new Person("anurag", 21));

        List<Person> list3 = new ArrayList<>();
        list3.add(new Person("anurag", 21));
        list3.add(new Person("monu", 17));
        list3.add(new Person("rag", 11));

        List<List<Person>> listOfLists = Arrays.asList(list1, list2, list3);

        //map
        listOfLists.stream().map(list -> list.size()).forEach(s-> System.out.print(s+" "));
        System.out.println();
        Stream<Stream<Person>> mapStreamOfStreams = listOfLists.stream().map(list -> list.stream());
        mapStreamOfStreams.forEach(s-> System.out.println(s));

        System.out.println("--------------------------------------------------------------------");
        //flatmap
        listOfLists.stream().flatMap(list -> list.stream()).forEach(s-> System.out.print(s+" "));
        System.out.println();
        Stream<Person> flatmapStreamOfStreams = listOfLists.stream().flatMap(list -> list.stream());
        flatmapStreamOfStreams.forEach(s-> System.out.println(s));

    }
}
