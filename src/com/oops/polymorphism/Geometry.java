package com.oops.polymorphism;

public class Geometry {
    public static void main(String[] args) {
        Shape shape = new Shape(12, 13);
        shape.area();

        Rectangle rectangle = new Rectangle(2, 4);
        rectangle.area();

        Trapezium trapezium = new Trapezium(12, 2, 4);
        trapezium.area();


        Shape[] shapes = {new Rectangle(2, 4), new Shape(12, 3),
                new Trapezium(12, 2, 4), new Triangle(12, 4)};
        for (int i=0; i<shapes.length; i++){
            shapes[i].area();
        }
    }
}
 //8
 //The shape has an area
 //28
 //24