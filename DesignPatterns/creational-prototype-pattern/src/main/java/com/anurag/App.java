package com.anurag;


public class App 
{
    public static void main( String[] args )
    {
       ShapeCache cache=new ShapeCache();
        try {
            System.out.println(cache.getShape("1"));
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
