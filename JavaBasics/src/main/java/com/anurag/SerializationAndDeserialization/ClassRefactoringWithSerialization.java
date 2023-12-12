package com.anurag.SerializationAndDeserialization;

import java.io.*;
/*
if a class do not have serialVersionUID constant then on removing class members or any changes in class
can cause below error on deserialization.
ERROR:
local class incompatible: stream classdesc serialVersionUID = 4494575913711440813, local class serialVersionUID = 4651241277059059435
 */

class Employee implements Serializable {

   // private static final long serialVersionUID= 5883341925017700677L;

    String name;
//    int id;
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id="  +
                ", name='" + name + '\'' +
                '}';
    }
}
public class ClassRefactoringWithSerialization {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

//        Employee emp=new Employee();
//        emp.setId(232323);
//        emp.setName("anurag");


//        ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("outFile.txt"));
//        out.writeObject(emp);

        ObjectInputStream input=new ObjectInputStream(new FileInputStream("outFile.txt"));
        System.out.println((Employee)input.readObject());


    }
}
