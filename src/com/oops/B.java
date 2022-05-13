package com.oops;

public class B {
    int i = 10;
    int j = 20;

    public B(int i, int j) {
        this.i = i;
        this.j = j;
    }


    public String toString(){
        return ""+i+", "+j;
    }

    public boolean equals(Object ob){ //Object ob = ob2;

        //down-casting
        B obj = (B)ob;
        return this.i == obj.i && this.j==obj.j;//22 == 12 && 33==30

    }

    public static void main(String[] args) {
        B ob1 = new B(12, 30);
        System.out.println(ob1);//12, 30


        B ob2 = new B(12, 30);
        System.out.println(ob1.equals(ob2));//

    }

}
