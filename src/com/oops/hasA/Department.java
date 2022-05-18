package com.oops.hasA;

import java.util.ArrayList;
import java.util.List;

public class Department {

    List<Student> students;

    String departmentName;

    public Department(List<Student> students, String departmentName) {
        this.students = students;
        this.departmentName = departmentName;
    }

    @Override
    public String toString() {
        return "Department{" +
                "students=" + students +
                ", departmentName='" + departmentName + '\'' +
                '}';
    }

    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Atul", "EE"));
        students.add(new Student("Shivani", "EE"));

        Department department = new Department(students, "EE");
        System.out.println(department);

    }
}
