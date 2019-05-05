package com.java.lesson08.test02;

public class PrivateOverride {
    private void f(){
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();   // private f()    只有非private方法才可以被覆盖
    }
}

class Derived extends PrivateOverride{
    public void f(){
        System.out.println("public f()");
    }
}
