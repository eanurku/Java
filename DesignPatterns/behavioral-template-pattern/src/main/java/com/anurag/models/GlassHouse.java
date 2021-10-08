package com.anurag.models;

public class GlassHouse extends HouseTemplate {

    @Override
    protected void buildWalls() {
        System.out.println("build Glass walls");
    }

    @Override
    protected void buildWindows() {

        System.out.println("build Glass Windows");
    }
}
