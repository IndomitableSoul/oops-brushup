package com.oops.finalKeyword;

public interface I {

    int x=0;//static, public,final

    void m1();



    static void m2(){
        System.out.println("abc");
        System.out.println(I.x);
    }

    default  void m3(){

    }

    private void m4(){
        System.out.println("Print");
    }

}

//Can we have constructor in interface?
//No

//Can interface inherit a class?
//No

//Can an interface inherit another interface?
//Yes, usig extends keyword

//Can a class inherit an interface?
//Yes, a class can inherit any number of interfaces using implements keyword

// class A implements X, Y
//class A implements X implements Y -----XXXXX

//Can an interface have concrete method?
//Only static, default and private non-static methods can be concrete in an interface

//In an interface a non-static method is by-default public and abstract.

//In an interface, a variable is by default public, static and final which must be initialized at the time of declaration.