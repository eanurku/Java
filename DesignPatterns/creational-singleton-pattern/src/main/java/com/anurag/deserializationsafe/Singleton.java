package com.anurag.deserializationsafe;

import java.io.Serializable;

public class Singleton implements Serializable {

    private static Singleton instance;

    public static Singleton getInstance(){
        if(instance==null){
            synchronized (Singleton.class){
                if(instance==null){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
    Object readResolve(){
        return getInstance();
    }
}
