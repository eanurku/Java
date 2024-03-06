package com.anurag.example;

interface Color{
    void fill();
}

class Red implements Color{

    @Override
    public void fill() {
        System.out.println("fill with red...");
    }
}


class Green implements Color{

    @Override
    public void fill() {
        System.out.println("fill with green");
    }
}

interface Shape{

    void draw();
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("circle drawn...");

    }
}
class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("rectangle drawn...");

    }
}
abstract class AbstractFactory{
    abstract Shape getShape(String type);
    abstract Color getColor(String type);
}

class ShapeFactory extends AbstractFactory{
    Shape getShape(String type){
        switch(type){
            case "circle":return new Circle();
            case "rect":return new Rectangle();
        }
        return null;
    }

    @Override
    Color getColor(String type) {
        return null;
    }
}

class ColorFactory extends AbstractFactory{


    @Override
    Shape getShape(String type) {
        return null;
    }

    @Override
    Color getColor(String type) {
        switch(type){
            case "red":return new Red();
            case "green":return new Green();
        }
        return null;
    }
}

class FactoryProducer{
    static AbstractFactory  getFactory(String value){
        if(value.equals("shape")){
            return new ShapeFactory();
        }else
            return new ColorFactory();

    }
}
public class App
{
    public static void main( String[] args ) {

        FactoryProducer.getFactory("shape").getShape("circle").draw();
        FactoryProducer.getFactory("color").getColor("red").fill();



    }
}
