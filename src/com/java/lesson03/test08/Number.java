package com.java.lesson03.test08;

public class Number {
    public static void main(String[] args) {
        Long eight = 0123L;
        Long sixteen = 0x12fbcaL;

        System.out.println("eight->binaryString:"+Long.toBinaryString(eight));
        System.out.println("sixteen->binaryString:"+Long.toBinaryString(sixteen));

    }
}
