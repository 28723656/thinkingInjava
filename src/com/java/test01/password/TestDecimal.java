package com.java.test01.password;

public class TestDecimal {
    public static void main(String[] args) {

//        double d = 123.2312;
//
//        System.out.println(String.format("%.2f", d));

        String format = String.format("%.2f", (double)334 / 10000 * 100);
        System.out.println(format);
        System.out.println("最大的Int值"+String.format("%.2e",(double)Integer.MAX_VALUE));
    }
}
