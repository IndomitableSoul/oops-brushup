package com.oops.hasA;

public class Student {
    String name;
    String deptName;

    public Student(String name, String deptName) {
        this.name = name;
        this.deptName = deptName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", deptName='" + deptName + '\'' +
                '}';
    }
}
