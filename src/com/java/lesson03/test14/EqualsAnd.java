package com.java.lesson03.test14;

public class EqualsAnd {
    public static void main(String[] args) {
        String s0 = "aa";
        String s1 = "aa";
        String s2 =  new String("aa");
        String s3 = new String("aa");

        System.out.println(s1.equals(s2));
        System.out.println(s1 == s2);

        System.out.println(s2.equals(s3));
        System.out.println(s2==s3);

        System.out.println(s1.equals(s0));
        System.out.println(s0 == s1);


    }
}
