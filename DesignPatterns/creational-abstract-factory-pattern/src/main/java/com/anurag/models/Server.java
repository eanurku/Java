package com.anurag.models;

public class Server extends Computer {

    public Server(String ram, String processor, String hardDisk) {
        super(ram, processor, hardDisk);
    }

    @Override
    public String toString() {
        return "Server{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                '}';
    }
}
