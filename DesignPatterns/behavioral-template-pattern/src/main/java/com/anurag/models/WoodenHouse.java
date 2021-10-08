package com.anurag.models;

public class WoodenHouse extends HouseTemplate {

    @Override
    protected void buildWalls() {
        System.out.println("build wooden walls");
    }

    @Override
    protected void buildWindows() {

        System.out.println("build wooden windows");
    }
}
