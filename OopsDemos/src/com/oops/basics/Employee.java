package com.oops.basics;

public class Employee {
    String employeeName;
    int employeeId;
    double salary;

    public Employee(String employeeName, int employeeId, double salary) {
        this.employeeName = employeeName;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    void getDetails(){
        System.out.println("Name : "+employeeName);
        System.out.println("ID : "+employeeId);
        System.out.println("Salary : "+salary);
    }

    String greet(String msg){
        return msg+" "+employeeName;
    }
}
