package com.anurag.models;

public class PC extends Computer {



    public PC(String ram, String processor, String hardDisk) {
        super(ram,processor,hardDisk);
    }

    @Override
    public String toString() {
        return "PC{" +
                "ram='" + ram + '\'' +
                ", processor='" + processor + '\'' +
                ", hardDisk='" + hardDisk + '\'' +
                '}';
    }
}
