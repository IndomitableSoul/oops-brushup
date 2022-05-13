package com.oops;

public class A {

    int x;

    public A(){

    }

    public A(int x){
        //this is used to access non-static members of a class
        this.x = x;
    }

    //Class which is overriding the method should be subclass of the class whose method is being overridden
    //method name should be same and return type also
    //parameters same
    //The overriding method cannot increase the restriction

    public String toString(){
        return ""+ this.x;
    }


    public static void main(String[] args) {
        A ob = new A(10);
        System.out.println(ob);//10
//        System.out.println(ob.x);//10
//        System.out.println(ob.toString());//10

    }


}
