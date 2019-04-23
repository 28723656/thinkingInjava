package com.java.lesson3.test07;

import java.util.Random;

public class Coin {
    public static void main(String[] args) {
        Random random = new Random(47);

        for(int i=1;i<=10000;i++){
           String coin =  random.nextInt(100)>50?"1":"0";
            System.out.print(coin);
            if(i % 100 ==0){
                System.out.println();
            }
        }

    }
}
