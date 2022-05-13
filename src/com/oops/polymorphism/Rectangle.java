package com.oops.polymorphism;

public class Rectangle extends Shape{

    public Rectangle(int length1, int length2) {
        super(length1, length2);
    }

    public void area(){
        System.out.println(length1*length2);
    }

}
