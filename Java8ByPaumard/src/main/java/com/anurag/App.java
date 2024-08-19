package com.anurag;


import com.sun.org.apache.bcel.internal.generic.ARETURN;

import java.util.*;
import java.util.function.Consumer;
import java.util.stream.Collectors;

class Employee{
    int id;
    String name;
    int salary;

    public Employee() {
    }

    public Employee(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}

interface nothing{
    void apply();
}

public class App {

    static public void say(){
        System.out.println("saying ....");
    }

    public static void main( String[] args )
    {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee(1,"anu",2000));
        list.add(new Employee(2,"monu",3000));
        list.add(new Employee(3,"gonu",2000));
        list.add(new Employee(4,"sonu",3000));
        list.add(new Employee(5,"chonu",2000));

        Map<String, Map<Integer, List<Employee>>> groups = list.stream().collect(Collectors.groupingBy(Employee::getName, Collectors.groupingBy(Employee::getSalary)));

        System.out.println(groups);

        Map<Integer, Long> group2 = list.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting()));

        System.out.println(group2);

        Map<Integer, Integer> group3 = list.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.summingInt(Employee::getSalary)));
        System.out.println(group3);


        Map<Integer, List<String>> group4 = list.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.mapping(Employee::getName, Collectors.toList())));

        System.out.println(group4);

        Map<Integer, Double> group5 = list.stream().collect(Collectors.groupingBy(Employee::getSalary, Collectors.averagingInt(Employee::getSalary)));

        System.out.println(group5);



//        nothing ref = App::say;
//
//        Integer total = list.stream().map(Employee::getSalary).reduce(1, (a, b) -> {
//            return a + b;
//        });
//
//        System.out.println(total);
//
//        Optional<Employee> max = list.stream().max(Comparator.comparing(Employee::getSalary));
//
//        Random rand=new Random();
//
//        rand.ints().limit(10).forEach(System.out::println);










    }
}
