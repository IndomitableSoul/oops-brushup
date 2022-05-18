package com.oops.interFace;

import java.util.ArrayList;
import java.util.List;

public class Geometry {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();

        shapes.add(new Circle(2));
        shapes.add(new Rectangle(2, 4));

        for (Shape shape: shapes){
            shape.area();//12.56   //8
            shape.circumference();   // 12.56  // 12
        }

    }
}
