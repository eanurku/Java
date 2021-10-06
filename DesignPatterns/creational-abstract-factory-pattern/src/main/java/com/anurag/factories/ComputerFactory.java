package com.anurag.factories;

import com.anurag.models.Computer;

public class ComputerFactory {

    public static Computer getComputer(AbstractComputerFactory factory) {
        return factory.createComputer();

    }

}
