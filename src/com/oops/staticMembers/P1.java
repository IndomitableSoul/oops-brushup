package com.oops.staticMembers;

public class P1 {

    static int x;

    static{
        System.out.println("SIB-2");
    }
    static{
        System.out.println("SIB-1");
    }

    {
        System.out.println("NSIB-1");
    }


    public static void main(String[] args) {
//        int x=10;
//        System.out.println(x);
//        System.out.println(P1.x);
//        P1.x=20;
//        System.out.println(P1.x);//20
//        System.out.println(x);//
        System.out.println("Class started");
        P1 ob= new P1();


        P1 ob2 = new P1();}

}


//method
//variable
//block


