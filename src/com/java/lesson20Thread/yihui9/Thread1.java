package com.java.lesson20Thread.yihui9;

import java.util.Scanner;

public class Thread1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

          String thread1_1 =  scanner.next();
          int thread1_3 =  scanner.nextInt();
           int thread1_2 = scanner.nextInt();

        String thread2_1 =  scanner.next();
        int thread2_3 =  scanner.nextInt();
        int thread2_2 = scanner.nextInt();

        String thread3_1 =  scanner.next();
        int thread3_3 =  scanner.nextInt();
        int thread3_2 = scanner.nextInt();



        int[] arr = new int[]{thread1_2,thread2_2,thread3_2};
        Integer count = getMaxFromArr(arr);

        if (count == 0) {
            System.out.println(thread1_1);
        } else if (count == 1) {
            System.out.println(thread2_1);
        } else {
            System.out.println(thread3_1);
        }

    }



    public static Integer getMaxFromArr(int[] arr) {

        if (arr != null) {
            int count = 0;
            int max = arr[0];
            for (int i = 0; i < arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                    count = i;
                }
            }
            return count;
        }
        return null;
    }


}
