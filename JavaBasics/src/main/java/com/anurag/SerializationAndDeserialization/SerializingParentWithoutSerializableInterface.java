package com.anurag.SerializationAndDeserialization;


import java.io.*;

class Parent {
    protected String name;
    protected String id;

    public Parent() {
    }

    public Parent(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}

class Child extends Parent implements Serializable {
    private static final long serialVersionUID = -6657537082601598356L;
    int age;

    public Child() {
        super();
    }

    public Child(String name, String id, int age) {
        super(name, id);
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



   private  void writeObject(ObjectOutputStream os) throws IOException {

        os.defaultWriteObject();
        os.writeObject(name);
        os.writeObject(id);
        System.out.println("written object.......");
    }


    private void readObject(ObjectInputStream oi) throws IOException, ClassNotFoundException {

        oi.defaultReadObject();
        setName((String)oi.readObject());
        setId((String)oi.readObject());
        System.out.println("reading object.........");

    }

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", age=" + age +
                '}';
    }
}
public class SerializingParentWithoutSerializableInterface {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Child child = new Child("name","id",12);

        ObjectOutputStream oo=new ObjectOutputStream(new FileOutputStream("testfile.txt"));
        oo.writeObject(child);

        ObjectInputStream oi=new ObjectInputStream(new FileInputStream("testfile.txt"));
        Child chh= (Child)oi.readObject();

        System.out.println(chh);








    }
}
