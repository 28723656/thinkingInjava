package com.java.lesson05.test00;

public class MainClass {
    public static void main(String[] args) {
        TestClass test01 = new TestClass();
        TestClass test02 = new TestClass();
        System.out.println(test01==test02);
        System.out.println(test01.equals(test02));
    }


}
