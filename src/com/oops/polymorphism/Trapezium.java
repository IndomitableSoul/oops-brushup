package com.oops.polymorphism;

public class Trapezium extends Shape{
    int height;

    public Trapezium(int length1, int length2, int height) {
        super(length1, length2);
        this.height = height;
    }

    @Override
    public void area() {
        System.out.println(.5*(length1+length2)*height);
    }
}
