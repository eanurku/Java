package com.anurag;

public class EmployeeController {
    EmployeeService empService;

    public EmployeeController(EmployeeService empService) {
        this.empService = empService;
    }

    Employee getEmplyee(String id){
       return empService.getEmployee(id);
    }
}
