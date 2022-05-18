package com.oops.interFace;

public class Rectangle implements Shape{
    int length;
    int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public void area() {
        System.out.println(length*breadth);
    }

    @Override
    public void circumference() {
        System.out.println(2*(length+breadth));
    }
}
