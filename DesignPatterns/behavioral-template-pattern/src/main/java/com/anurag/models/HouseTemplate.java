package com.anurag.models;

public abstract class HouseTemplate {


    public final void buildHouse(){

        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();


    }

    private void buildPillars() {
        System.out.println("build pillars");
    }

    private void buildFoundation() {
        System.out.println("build foundation");
    }

    protected abstract void buildWalls();

    protected abstract void buildWindows();

}
