package com.anurag.Reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Teachers {

    private String name;

    private void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "name='" + name + '\'' +
                '}';
    }
}

public class ReflectionModifyObjects {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException, NoSuchMethodException,
            InvocationTargetException, ClassNotFoundException {

        Teachers tobj=new Teachers();

        System.out.println(tobj.getName());


        Class<? extends Teachers> classobj = tobj.getClass();

        //access field and set value
        Field nameField = classobj.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(tobj,"gonu");
        System.out.println(tobj.getName());


        Class<?> classObject = Class.forName("com.anurag.Reflection.Teachers");

        //acess method and set value
        Method method = classObject.getDeclaredMethod("setName", String.class);
        method.setAccessible(true);
        method.invoke(tobj,"new name");
        System.out.println(tobj.getName());

    }
}
