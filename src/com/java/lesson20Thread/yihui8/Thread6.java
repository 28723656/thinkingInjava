package com.java.lesson20Thread.yihui8;

import java.util.Scanner;

public class Thread6 {
    public static void main(String[] args) {
        // 8*8  1表示占用 0表示空闲
        int[][] arr = new int[8][8];

        // 初始化
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                arr[i][j] = 0;
            }
        }


        // 添加占用的 2、7、13、23、37、47、59、61
        arr[0][1] = 1;
        arr[0][7] = 1;
        arr[1][5] = 1;
        arr[2][7] = 1;
        arr[4][5] = 1;
        arr[5][7] = 1;
        arr[7][3] = 1;
        arr[7][5] = 1;

        // 处理输入
        Scanner scanner = new Scanner(System.in);
        int userInputNumber = Integer.parseInt(scanner.nextLine());

        String tempNum = scanner.nextLine();
        String[] userNumArr = tempNum.split(" ");

/*
        if(userInputNumber>56){
            System.out.println(false);
            return;
        }*/

        boolean searchOK = false;


        for (int k = 0; k < userNumArr.length; k++) {

            //需要填充的个数   3,3,3
            Integer inputNumber = Integer.parseInt(userNumArr[k]);

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {


                    // 空余的个数  大于或等于  需求的个数
                    if (getEmptyCount(arr) >= inputNumber) {

                        // 空闲
                        if (arr[i][j] == 0) {
                            // 强势插入
                            inputNumber--;
                            // 标记一下
                            arr[i][j] = 1;
                        }

                    } else {
                        //  空间不足
                        System.out.println(false);
                        searchOK = true;
                        break;
                    }


                    if (inputNumber <= 0) {
                        System.out.print(i * 8 + j + " ");
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


    // 获取数组中 空闲的个数
    public static Integer getEmptyCount(int[][] arr) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (arr[i][j] == 0) {
                    count++;
                }
            }
        }
        return count;
    }


}
