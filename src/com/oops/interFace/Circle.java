package com.oops.interFace;

public class Circle implements Shape{
    int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void area() {
        System.out.println(PI * r * r);
    }

    @Override
    public void circumference() {
        System.out.println(2 * PI * r);
    }
}
