package com.anurag.threadsafedoublecheck;

public class ThreadSafeDoubleCheckDemo {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1);
        System.out.println(s2);
    }
}
