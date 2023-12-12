package com.anurag.Reflection;


import java.lang.reflect.Constructor;
import java.util.Arrays;

class SampleClass {

    private String name;
    int num;


    public String getName() {
        return name;
    }

    public int getNum() {
        return num;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNum(int num) {
        this.num = num;
    }


    public SampleClass(String name, int num) {
        this.name = name;
        this.num = num;
    }

    public SampleClass(String name) {
        this(name, 0);
    }


}

public class ReflectionOtherMethods {

    public static void main(String[] args) {

        SampleClass obj=new SampleClass("anurag",123);

        Class<? extends SampleClass> classObject = obj.getClass();


        Arrays.stream(classObject.getConstructors()).forEach(item-> System.out.println(item));
        Arrays.stream(classObject.getDeclaredMethods()).forEach(item-> System.out.println(item));
        Arrays.stream(classObject.getDeclaredFields()).forEach(item-> System.out.println(item));





    }
}
