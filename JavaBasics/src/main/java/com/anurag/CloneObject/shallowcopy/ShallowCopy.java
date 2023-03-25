package com.anurag.CloneObject.shallowcopy;



class Name{
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Name{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

class Employee implements Cloneable{
    private String id;
    private Name fullname;

    public Employee(String id, Name fullname) {
        this.id = id;
        this.fullname = fullname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Name getFullname() {
        return fullname;
    }

    public void setFullname(Name fullname) {
        this.fullname = fullname;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id='" + id + '\'' +
                ", fullname=" + fullname +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}



public class ShallowCopy {
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee emp1=new Employee("123",new Name("Anurag","kumar"));
        System.out.println(emp1);
        Employee cloneEmp1 = (Employee) emp1.clone();
        System.out.println(cloneEmp1);
        System.out.println("----------------------");

        emp1.setId("200");
        System.out.println(emp1);
        System.out.println(cloneEmp1);
        System.out.println("----------------------");

        emp1.getFullname().setFirstName("Monu");
        System.out.println(emp1);
        System.out.println(cloneEmp1);
        System.out.println("----------------------");



    }
}
