package com.java.lesson03.test11;

public class LeftLeft {
    public static void main(String[] args) {
        Integer numberBefore = 20;
        Integer numberAfter = numberBefore << 2;

        System.out.println(numberBefore+"的二进制表示："+Integer.toBinaryString(numberBefore));
        System.out.println("向左位移2位的二进制表示："+Integer.toBinaryString(numberAfter));

    }
}

