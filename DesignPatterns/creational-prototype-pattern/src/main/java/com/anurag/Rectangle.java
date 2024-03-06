package com.anurag;

public class Rectangle extends Shape{

    public Rectangle(String id, String name) {
        super(id, name);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
