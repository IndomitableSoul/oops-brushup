package com.oops.polymorphism;

public class Rectangle extends Shape{

    public Rectangle(int length1, int length2) {
        super(length1, length2);
    }

    public void area(){
        System.out.println(length1*length2);
    }

}

//abstract methods must be overridden in child class if we want to instantiate the child class otherwise we must
//make the child class also abstract

//abstract methods must be overridden in the child class in order to provide them implementation
