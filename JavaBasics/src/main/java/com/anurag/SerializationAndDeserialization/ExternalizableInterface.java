package com.anurag.SerializationAndDeserialization;


import java.io.*;

class Bike implements Externalizable {
    int id;
    String name;

    public Bike() {
    }

    public Bike(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeInt(id);
        out.writeObject(name);

    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        id=in.readInt();
        name=(String)in.readObject();
    }

    @Override
    public String toString() {
        return "Bike{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}



public class ExternalizableInterface {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Bike bike=new Bike(12,"KTM 390");
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("textfile.txt"));
        oos.writeObject(bike);

        ObjectInputStream ois=new ObjectInputStream(new FileInputStream("textfile.txt"));
        Bike obj = (Bike) ois.readObject();
        System.out.println(obj);

    }
}
