package com.anurag;
import com.anurag.Employee.EmployeeBuilder;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        EmployeeBuilder builder = new EmployeeBuilder("anur", "123");
        Employee emp = builder.setSalary(123)
                .SetProfession("mgr")
                .SetLevel("l1")
                .build();
        System.out.println(emp);

    }
}
