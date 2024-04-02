package com.util.maps;


public class Department {
    private String deptName;
    private String deptHead;
    private int depId;

    public Department() {
    }

    public Department(String deptName, String deptHead, int depId) {
        this.deptName = deptName;
        this.deptHead = deptHead;
        this.depId = depId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getDeptHead() {
        return deptHead;
    }

    public void setDeptHead(String deptHead) {
        this.deptHead = deptHead;
    }

    public int getDepId() {
        return depId;
    }

    public void setDepId(int depId) {
        this.depId = depId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptName='" + deptName + '\'' +
                ", deptHead='" + deptHead + '\'' +
                ", depId=" + depId +
                '}';
    }
}
