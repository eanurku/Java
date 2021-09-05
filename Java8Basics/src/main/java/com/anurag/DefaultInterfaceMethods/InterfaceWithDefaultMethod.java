package com.anurag.DefaultInterfaceMethods;


interface FourWheelar{

    default  void print(){
        System.out.println("inside four wheelar print()");
    }

    static void applybreak(){
        System.out.println("inside four wheelar apply break");
    }
}

class Car implements FourWheelar{


}

public class InterfaceWithDefaultMethod {
    public static void main(String[] args) {

        Car car=new Car();
        car.print();
        FourWheelar.applybreak();
    }
}
