package com.java.lesson20Thread.yihui9;

import java.util.Scanner;

public class Thread5 {
    public static void main(String[] args) {

        int[][] arr = new int[8][8];


        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                arr[i][j] = 0;
            }
        }



        arr[0][1] = 1;
        arr[0][7] = 1;
        arr[1][5] = 1;
        arr[2][7] = 1;
        arr[5][7] = 1;
        arr[7][3] = 1;


        Scanner scanner = new Scanner(System.in);
        int userInputNumber = scanner.nextInt();
        int userInputNumber2 = scanner.nextInt();
        int userInputNumber3 = scanner.nextInt();

        if (userInputNumber > 58) {
            System.out.println(false);
            return;
        }

        boolean searchOK = false;

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if (arr[i][j] == 0) {

                    userInputNumber--;

                    arr[i][j] = 1;
                }

                if (userInputNumber <= 0) {
                    System.out.println(i * 8 + j);
                    searchOK = true;
                    break;
                }

            }
            if (searchOK) {
                break;
            }
        }

    }


}
