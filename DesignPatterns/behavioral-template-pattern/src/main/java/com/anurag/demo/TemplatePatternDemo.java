package com.anurag.demo;

import com.anurag.models.GlassHouse;
import com.anurag.models.HouseTemplate;
import com.anurag.models.WoodenHouse;

/**
 * Hello world!
 */
public class TemplatePatternDemo {

    public static void main(String[] args) {

        HouseTemplate house = new WoodenHouse();
        house.buildHouse();

        System.out.println("---------------------");

        house = new GlassHouse();
        house.buildHouse();

    }
}
