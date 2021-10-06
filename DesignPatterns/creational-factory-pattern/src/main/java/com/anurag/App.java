package com.anurag;

import com.anurag.models.Shape;

public class App {

    public static void main(String[] args) {

        Shape circle = ShapeFactory.getInstance("CIRCLE");
        circle.draw();
        Shape rectangle = ShapeFactory.getInstance("RECTANGLE");
        rectangle.draw();
        Shape square = ShapeFactory.getInstance("SQUARE");
        square.draw();
    }
}
