package com.oops.polymorphism;

public class Triangle extends Shape{
    public Triangle(int length1, int length2) {
        super(length1, length2);
    }

    public void area(){
        System.out.println(0.5*length1*length2);
    }
}
