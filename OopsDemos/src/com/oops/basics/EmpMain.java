package com.oops.basics;

public class EmpMain {
    public static void main(String[] args) {
        System.out.println("Welcome");
        Employee employee = new Employee("Sridhar", 18,2000);
//        System.out.println("Name : "+employee.employeeName);
//        System.out.println("ID : "+employee.employeeId);
//        System.out.println("Salary : "+employee.salary);
//        System.out.println("-----------------");

        employee.getDetails();
        System.out.println(employee.greet("Hello"));
    }
}
