package com.anurag.FunctionalInterface.bipredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class BiPredicateUse {

    public static void main(String[] args) {

        List<Dev> devs = new ArrayList<>();
        devs.add(new Dev("anurag", 12));
        devs.add(new Dev("sonu", 21));
        devs.add(new Dev("monu", 32));

        BiPredicate<String, Integer> bicheck = (string, length) -> string.length() == length;

        List<Dev> list = filterlist(devs, bicheck);
        System.out.println(list);

    }

    private static List<Dev> filterlist(List<Dev> devs, BiPredicate<String, Integer> bicheck) {

        return devs.stream().filter(dev->bicheck.test(dev.getName(),4)).collect(Collectors.toList());
    }

}

class Dev {

    String name;
    int    id;

    public Dev(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Dev{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}