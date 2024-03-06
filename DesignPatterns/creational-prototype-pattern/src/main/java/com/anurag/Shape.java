package com.anurag;

public class Shape implements Cloneable{

    String id;
    String name;

    public Shape(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        return super.clone();
    }
}
