package com.java.lesson4.test10;

public class FourNumber {
    public static void main(String[] args) {
        for (int i = 1000; i < 9999; i++) {

            // i = 1234
            int num1 = i / 1000;
            int num2 = i / 100 % 10;
            int num3 = i / 10 % 10;
            int num4 = i % 10;

            if (num3 == 0 && num4 == 0) {
                continue;
            }


            boolean flag = false;
            // 12*34
            if((num1*10+num2)*(num3*10+num4)==i){
                flag = true;
            // 12*43
            }else if((num1*10+num2)*(num4*10+num3)==i){
                flag = true;
            //13*24
            }else if((num1*10+num3)*(num2*10+num4)==i){
                flag = true;
                // 13*42
            }else if((num1*10+num3)*(num4*10+num2)==i){
                flag = true;
                // 14*23
            }else if((num1*10+num4)*(num2*10+num3)==i){
                flag = true;
                //14*32
            }else if((num1*10+num4)*(num3*10+num2)==i){
                flag = true;
                //21*34
            }else if((num2*10+num1)*(num3*10+num4)==i){
                flag = true;
                // 21*43
            }else if((num2*10+num1)*(num4*10+num3)==i){
                flag = true;
                // 23*41
            }else if((num2*10+num3)*(num4*10+num1)==i){
                flag = true;
                // 24*31
            }else if((num2*10+num4)*(num3*10+num1)==i){
                flag = true;
                // 31*42
            }else if((num3*10+num1)*(num4*10+num2)==i){
                flag = true;
                // 32*41
            }else if((num3*10+num2)*(num4*10+num1)==i){
                flag = true;
            }
            if(flag){
                System.out.println(i);
            }

        }
    }
}
