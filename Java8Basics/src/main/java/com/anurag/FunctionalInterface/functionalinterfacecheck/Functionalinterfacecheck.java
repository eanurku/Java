package com.anurag.FunctionalInterface.functionalinterfacecheck;


interface ParentInterface<T, R> {
    R test(T t);

}

@FunctionalInterface
interface ChildInterface<T,R> extends ParentInterface {

}

public class Functionalinterfacecheck {
    public static void main(String[] args) {

        ChildInterface<String,String> ref=s->s+" is my name";
        System.out.println(ref.test("anurag"));

    }
}
