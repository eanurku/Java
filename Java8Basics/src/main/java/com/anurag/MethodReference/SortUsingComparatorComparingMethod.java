package com.anurag.MethodReference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee{
    String name;
    int    age;
    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }



}

public class SortUsingComparatorComparingMethod {
    public static void main(String[] args) {



        List<String> list=new ArrayList<>();
        list.add("sonu");
        list.add("monu");
        list.add("anu");


        Collections.sort(list, Comparator.comparing(String::toString));
        list.forEach(s-> System.out.println(s));
        System.out.println();

        List<Employee> emplist=new ArrayList<>();
        emplist.add(new Employee("sonu",100));
        emplist.add(new Employee("monu",11));
        emplist.add(new Employee("anu",10));
        emplist.add(new Employee("sonu",50));



        Collections.sort(emplist, Comparator.comparing(Employee::getName));
        emplist.forEach(s-> System.out.println(s.getName()+" "+s.getAge()));
        System.out.println();

        Collections.sort(emplist, Comparator.comparing(Employee::getName).thenComparing(Employee::getAge));
        emplist.forEach(s-> System.out.println(s.getName()+" "+s.getAge()));





    }
}
