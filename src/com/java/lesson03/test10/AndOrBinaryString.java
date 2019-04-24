package com.java.lesson03.test10;

public class AndOrBinaryString {
    public static void main(String[] args) {
        Integer num1 = 0x23456;
        Integer num2 = 0x34567;

        System.out.println("num1:\t\t\t"+Integer.toBinaryString(num1));
        System.out.println("num2:\t\t\t"+Integer.toBinaryString(num2));

        // 全1为1，否则为0
        Integer numAnd = num1&num2;
        // 全0为0，否则为1
        Integer numOr = num1|num2;
        // 相同为0，不同为1
        Integer numNotOr = num1^num2;
        // 按位取反
        Integer numNot = ~num1;

        System.out.println("num1 & num2:\t"+Integer.toBinaryString(numAnd));
        System.out.println("num1 | num2:\t"+Integer.toBinaryString(numOr));
        System.out.println("num1 ^ num2:\t"+Integer.toBinaryString(numNotOr));
        System.out.println("~num1:\t"+Integer.toBinaryString(numNot));
    }
}
