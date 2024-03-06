package com.anurag;

public class Circle extends Shape{

    public Circle(String id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
