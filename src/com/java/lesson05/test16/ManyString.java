package com.java.lesson05.test16;

import java.util.Random;

public class ManyString {
    public static void main(String[] args) {
        String[] str = new String[new Random().nextInt(50)];

        for(int i=0;i<str.length;i++){
            str[i] = new Random().nextInt(500)+"";
        }

        for(String tempStr : str){
            System.out.println(tempStr);
        }
    }
}
