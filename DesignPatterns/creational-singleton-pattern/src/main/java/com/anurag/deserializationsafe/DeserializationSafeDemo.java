package com.anurag.deserializationsafe;


import java.io.*;

public class DeserializationSafeDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Singleton obj = Singleton.getInstance();

        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("textfile.txt"));
        oos.writeObject(obj);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("textfile.txt"));

        Singleton newobj = (Singleton) ois.readObject();
        System.out.println(obj);
        System.out.println(newobj);

    }
}
