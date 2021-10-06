package com.anurag.billpugh;

public class Singleton {

    private Singleton() {
        System.out.println("creating singleton");
    }

    private static class SingletonHelper {

        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
