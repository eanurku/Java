package com.anurag;

import com.anurag.factories.ComputerFactory;
import com.anurag.factories.PCFactory;
import com.anurag.factories.ServerFactory;
import com.anurag.models.Computer;


public class App 
{
    public static void main( String[] args ) {

        PCFactory pcfactory = new PCFactory("10GB", "i3", "100GB");
        Computer computer = ComputerFactory.getComputer(pcfactory);

        System.out.println(computer);

        ServerFactory serverfactory = new ServerFactory("10GB", "i3", "100GB");
        computer = ComputerFactory.getComputer(serverfactory);

        System.out.println(computer);

    }
}
