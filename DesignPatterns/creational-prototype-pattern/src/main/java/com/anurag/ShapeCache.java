package com.anurag;



import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

    Map<String,Shape> shapeMap;

    public ShapeCache() {
        this.shapeMap = new HashMap<>();
        loadCache();
    }

    public void loadCache(){
        Circle circle = new Circle("cir", "circle ");
        Rectangle rect = new Rectangle("rect", "Rectangle");

        shapeMap.put("1",circle);
        shapeMap.put("2",rect);



    }

    Shape getShape(String id) throws CloneNotSupportedException {
        Shape shape = shapeMap.get(id);
        return (Shape) shape.clone();

    }
}
