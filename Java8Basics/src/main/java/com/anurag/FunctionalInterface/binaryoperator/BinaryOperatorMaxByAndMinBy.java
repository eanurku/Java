package com.anurag.FunctionalInterface.binaryoperator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

class Developer {

    String     name;
    BigDecimal salary;

    public Developer(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class BinaryOperatorMaxByAndMinBy {

    public static void main(String[] args) {
        List<Developer> devs = new ArrayList<>();
        devs.add(new Developer("dev1", BigDecimal.valueOf(4000)));
        devs.add(new Developer("dev2", BigDecimal.valueOf(2000)));
        devs.add(new Developer("dev3", BigDecimal.valueOf(5000)));
        devs.add(new Developer("dev4", BigDecimal.valueOf(1000)));

        Comparator<Developer> salaryComparator = Comparator.comparing(Developer::getSalary);
        BinaryOperator<Developer> func1 = BinaryOperator.maxBy(salaryComparator);
        Developer maxdev = find(devs, func1);
        System.out.println(maxdev);

        Developer mindev = find(devs, BinaryOperator.minBy(Comparator.comparing(Developer::getSalary)));
        System.out.println(mindev);
    }

    private static Developer find(List<Developer> devs, BinaryOperator<Developer> func) {

        Developer result = null;
        for (Developer dev : devs) {
            if (result == null) {
                result = dev;
            } else {
                result = func.apply(result, dev);
            }
        }

        return result;
    }

}
