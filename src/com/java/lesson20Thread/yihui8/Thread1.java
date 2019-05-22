package com.java.lesson20Thread.yihui8;

import java.util.Arrays;
import java.util.Scanner;

public class Thread1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String thread1 = scanner.nextLine();
        String thread2 = scanner.nextLine();
        String thread3 = scanner.nextLine();

        String[] s1 = thread1.split(" ");
        String[] s2 = thread2.split(" ");
        String[] s3 = thread3.split(" ");

        int[] arr = new int[]{Integer.parseInt(s1[1]),Integer.parseInt(s2[1]),Integer.parseInt(s3[1])};
        Integer count = Util.getMaxFromArr(arr);

        if(count == 0){
            System.out.println(s1[0]);
        }else if(count ==1){
            System.out.println(s2[0]);
        }else{
            System.out.println(s3[0]);
        }

    }




}
