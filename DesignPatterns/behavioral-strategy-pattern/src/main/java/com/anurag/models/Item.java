package com.anurag.models;

public class Item {

    String name;
    String code;
    int    price;

    public Item(String name, String code, int price) {
        this.name = name;
        this.code = code;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
