package com.anurag.factories;

import com.anurag.models.Computer;
import com.anurag.models.PC;

public class PCFactory extends AbstractComputerFactory {
    String ram;
    String processor;
    String hardDisk;

    public PCFactory(String ram, String processor, String hardDisk) {
        this.ram = ram;
        this.processor = processor;
        this.hardDisk = hardDisk;
    }

    @Override
    public Computer createComputer() {
        System.out.println("creating Pc ");
        return new PC(this.ram,this.processor,this.hardDisk);
    }
}
