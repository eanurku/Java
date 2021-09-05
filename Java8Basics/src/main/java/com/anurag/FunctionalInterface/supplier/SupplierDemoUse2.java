package com.anurag.FunctionalInterface.supplier;

import java.util.function.Supplier;

class Developer{
    String name;
    int    id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }
}

public class SupplierDemoUse2 {

    public static void main(String[] args) {
        Developer dev = factory(Developer::new);
        System.out.println(dev);

    }

    private static Developer factory(Supplier<Developer> dev) {

        Developer developer = dev.get();
        developer.setName("mydev");
        return developer;
    }
}
