package com.anurag.LamdaExpression;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortCustomListUsingLambda {

    public static void main(String[] args) {

        List<Developer> listJav8 = new ArrayList<>();
        listJav8.add(new Developer(null,12,1));
        listJav8.add(new Developer("monu",23,2));
        listJav8.add(new Developer("gonu",43,3));
        listJav8.add(new Developer("ponu",32,4));
        listJav8.add(new Developer("donu",11,5));

        Comparator<Developer> comp1 = Comparator.comparing(dev -> dev.getName());
        listJav8.sort(comp1);
        listJav8.forEach(System.out::println);
        System.out.println("-----------------");
        Comparator<Developer> comp2 = Comparator.comparing(dev->dev.getAge());
        listJav8.sort(comp2);
        listJav8.forEach(System.out::println);
        System.out.println("------------------");
        Comparator<Developer> comp3 = Comparator.comparing(dev->dev.getId());
        listJav8.sort(comp3);
        listJav8.forEach(System.out::println);
        System.out.println("--------------------");

    }
}

class Developer {
    String name;
    int    age;
    int    id;

    public Developer(String name, int age, int id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }
}