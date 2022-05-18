package com.oops.polymorphism;

public abstract class Shape {
    int length1;
    int length2;

    public Shape(int length1, int length2) {
        this.length1 = length1;
        this.length2 = length2;
    }

    public abstract void area();



}


//a method without a body is called an abstract method
// it must be prefixed with abstract keyword


//a class which has even one single abstract method should be prefixed with abstract keyword
//A class which is prefixed with abstract keyword is called an abstract class
//An abstract class cannot be instantiated

//abstract methods must be overridden in child class if we want to instantiate the child class otherwise we must
//make the child class also abstract

//Can I have constructor inside an abstract class?
//Yes abstract class will always have a constructor because its a class.

//we cannot increase the restriction while overriding from one class to another

//abstract methods cannot be private

//private members are not inherited from parent class to child class

//Can an abstract method be made final?
//a final method cannot be overridden. But an abstract method must be overridden in order to give implementation.
//Therefore, an abstract method cannot be final

//Does an abstract class inherit Object class?
//Yes, every class does that.

//Can we have concrete method inside abstract class?
//Yes we can have both concrete as well as abstract methods inside it.

//In concrete class can we have abstract methods?
//No, only concrete methods are allowed


