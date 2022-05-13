package com.oops.methodOverriding;

public class B extends A{

    public B(int i, int j) {
        super(i, j);
    }

    public int calculate(){
        return i*j;
    }
}
