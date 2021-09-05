package com.anurag.FunctionalInterface.function;

import java.util.function.Function;

public class FunctionObjectCreation {

    public static void main(String[] args) {

        Function<String, Employee> func = Employee::new;
        Employee res = func.apply("anurag");
        System.out.println(res.getName());
    }

}

class Employee{
    String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}