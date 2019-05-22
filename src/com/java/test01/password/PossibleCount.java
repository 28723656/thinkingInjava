package com.java.test01.password;

import java.util.Random;

public class PossibleCount {

    private final static int TIMES = 100000;

    public static void main(String[] args) {
        Random random = new Random(23);


        int[] arr = new int[51];


        for (int j = 0; j < TIMES; j++) {

            int count = 0;
            for (int i = 0; i < 50; i++) {
                int nextInt = random.nextInt(100);
                if (nextInt > 50) {
                    count++;
                }
            }
            arr[count]++;
        }

        for (int i = 1; i <arr.length; i++) {
            String formatNumber = String.format("%.2f", (double) arr[i] / TIMES * 100);
            if((double)arr[i] / TIMES * 100> 2d){
                System.out.println(i + "次出现：" + arr[i]+"\t\t百分比:"+formatNumber+"%\t\t\t"+"结果数:"+getC50(i));
            }
        }

        System.out.println("最大的Int值为：\t\t\t\t\t\t\t\t\t"+String.format("%.2e",(double)Integer.MAX_VALUE));
    }

    // 获得C20/50
    private static  String  getC50(int count) {

        double up = 1.0;
        double down = 1.0;

        for (int m = 1; m <= count; m++) {
            up = up*(51-m);
            down = down *m;
        }

        return String.format("%.2e",up/down);
    }
}
