package com.anurag.CloneObject;


class Student implements Cloneable {

    String name;


    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                '}';
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class CloneDemo {

    public static void main(String[] args) throws CloneNotSupportedException {
        Student st = new Student("monu");
        System.out.println(st);

        Student cloneObj= (Student) st.clone();
        System.out.println(cloneObj);
    }
}
