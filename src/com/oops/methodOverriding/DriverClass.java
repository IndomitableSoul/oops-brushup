package com.oops.methodOverriding;

public class DriverClass {
    public static void main(String[] args) {
        A obj = new A(10, 20);

        System.out.println(obj.calculate());// 10+20 = 30

        B obj1 = new B(10,20);

        System.out.println(obj1.calculate());//10*20=200


        //============================

        A ob = new B(10, 30);
        System.out.println(ob.calculate());//300


        //B ob1 = (B)new A(20, 40);//direct downcasting:  parent object cannot be cast to child
        //System.out.println(ob1.calculate());


        A ob3 = new B(10,40);

        B ob4 = (B)ob3;//downcasting after prior upcasting
        System.out.println(ob4.calculate());

    }
}
