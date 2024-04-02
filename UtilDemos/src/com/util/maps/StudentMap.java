package com.util.maps;

import java.util.*;

public class StudentMap {
    public static void main(String[] args) {
        Map<Department, List<Student>> studentList = new HashMap<>();
        Department department1 = new Department("ECE","Sridhar",18);
        Department department2 = new Department("CSE","Harsha",17);
        Department department3 = new Department("Civil","Likhith",16);

        Student student1 = new Student("Sriram","Hampi");
        Student student2 = new Student("Tejas","Tumkur");
        Student student3 = new Student("Sumanth","Shivmoga");

        studentList.put(department1, Arrays.asList(student1,student2,student3));

        System.out.println("Department of ECE");
        Set<Department> departmentMap = studentList.keySet();
        for (Department department : departmentMap){
            System.out.println(department.getDeptName()+" and "+department.getDeptHead()+" : "+studentList.get(department));
        }

        Student student4 = new Student("Jeevan","Hassan");
        Student student5 = new Student("Manjunath","Raichur");
        Student student6 = new Student("Sachin","Bengaluru");

        System.out.println();
        System.out.println("Department of CSE");
        studentList.put(department2, Arrays.asList(student4,student5,student6));

        Set<Department> departmentMap1 = studentList.keySet();
        for (Department department : departmentMap1){
            System.out.println(department.getDeptName()+" and "+department.getDeptHead()+" : "+studentList.get(department));
        }

        Student student7 = new Student("Amogh","Nelamangala");
        Student student8 = new Student("Puneeth","Malur");
        Student student9 = new Student("Vinod","Bidar");

        System.out.println();
        System.out.println("Department of Civil");
        studentList.put(department3, Arrays.asList(student7,student8,student9));
        Set<Department> departmentMap2 = studentList.keySet();
        for (Department department : departmentMap2){
            System.out.println(department.getDeptName()+" and "+department.getDeptHead()+" : "+studentList.get(department));
        }
    }
}
