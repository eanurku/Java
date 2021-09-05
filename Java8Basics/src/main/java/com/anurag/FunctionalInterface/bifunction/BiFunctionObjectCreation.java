package com.anurag.FunctionalInterface.bifunction;

import java.util.function.BiFunction;

public class BiFunctionObjectCreation {

    public static void main(String[] args) {

        BiFunction<String, Integer, Employee> func = Employee::new;
        Employee res = func.apply("anurag",1);
        System.out.println(res.toString());
    }

}

class Employee{
    String name;
    int    id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}