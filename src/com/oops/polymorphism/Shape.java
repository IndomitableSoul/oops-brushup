package com.oops.polymorphism;

public class Shape {
    int length1;
    int length2;

    public Shape(int length1, int length2) {
        this.length1 = length1;
        this.length2 = length2;
    }

    public void area(){
        System.out.println("The shape has an area");
    }
}
