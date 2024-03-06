package com.anurag;

public class Employee {
    //mandatory
    private String name;
    private String id;

    //optional
    private int salary;
    private String profession;
    private String level;

    public Employee(EmployeeBuilder builder) {
        this.name=builder.name;
        this.id=builder.id;
        this.salary=builder.salary;
        this.profession=builder.profession;
        this.level=builder.level;

    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", salary=" + salary +
                ", profession='" + profession + '\'' +
                ", level='" + level + '\'' +
                '}';
    }

    public static class EmployeeBuilder{
        //mandatory
        private String name;
        private String id;

        //optional
        private int salary;
        private String profession;
        private String level;

        public EmployeeBuilder(String name, String id) {
            this.name = name;
            this.id = id;
        }

        EmployeeBuilder setSalary(int salary){
            this.salary=salary;
            return this;
        }

        EmployeeBuilder SetProfession(String profession){
            this.profession=profession;
            return this;
        }

        EmployeeBuilder SetLevel(String level){
            this.level=level;
            return this;
        }


        Employee build(){
            return new Employee(this);
        }
    }
}
