package com.java.lesson05.test12;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Inside main()");
        Cups.cup1.f(99);
    }

    static Cups cups1 = new Cups();
    static Cups cups2 = new Cups();
}
