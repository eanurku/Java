package com.anurag.factories;

import com.anurag.models.Computer;
import com.anurag.models.Server;

public class ServerFactory extends AbstractComputerFactory {
    String ram;
    String processor;
    String hardDisk;

    public ServerFactory(String ram, String processor, String hardDisk) {
        this.ram = ram;
        this.processor = processor;
        this.hardDisk = hardDisk;
    }

    @Override
    public Computer createComputer() {
        return new Server(this.ram,this.processor,this.hardDisk);
    }

}
