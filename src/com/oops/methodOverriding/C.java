package com.oops.methodOverriding;

public class C extends B {

    public C(int i, int j) {
        super(i, j);
    }

    @Override
    public int calculate() {
        return i-j;
    }

    public static void main(String[] args) {
        C c = new C(100, 20);

        System.out.println(c.calculate());// 100*20=2000 //80

        A ob = new C(12, 4);
        System.out.println(ob.calculate());//8

//        B ob2 = new C(12, 4);
//        System.out.println(ob2.calculate());//80

        B ob2 = (B)ob;
        System.out.println(ob2.calculate());//8

        C ob3 = (C)ob2;
        System.out.println(ob3.calculate());//8


//        B obj = (B)new A(22, 10);//***
//        System.out.println(obj.calculate());//

        A obj = new A(22, 10);
        B obj1 = null;
        if(obj instanceof B)
            obj1 = (B)obj;

    }
}