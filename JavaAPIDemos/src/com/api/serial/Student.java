package com.api.serial;

import java.io.Serializable;

public class Student implements Serializable {

    private static final long serialVersionUID =  2L;
    private String studentName;
    private int studentId;
    private transient String dept;

    public Student() {
    }

    public Student(String studentName, int studentId, String dept) {
        this.studentName = studentName;
        this.studentId = studentId;
        this.dept = dept;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", studentId=" + studentId +
                ", dept='" + dept + '\'' +
                '}';
    }
}
