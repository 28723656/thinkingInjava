package com.java.lesson20Thread.yihui9;

import java.util.ArrayList;
import java.util.Scanner;

public class Thread7 {
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
        arr[0][1] = -1;
        arr[0][7] = -1;
        arr[1][5] = -1;
        arr[2][7] = -1;
        arr[4][5] = -1;
        arr[5][7] = -1;
        arr[7][3] = -1;
        arr[7][5] = -1;

        // 处理输入
        Scanner scanner = new Scanner(System.in);

        //输入第一行： 毫无意义的一个数
        scanner.nextLine();

        String tempNum = scanner.nextLine();
        String[] userNumArr = tempNum.split(" ");

        boolean searchOK = false;

        //第一行的显示结果，保存在这个集合中
        ArrayList<Object> resultOne = new ArrayList<>();


        // 处理中。。。
        for (int k = 0; k < userNumArr.length; k++) {

            //需要填充的个数   3,3,3
            Integer inputNumber = Integer.parseInt(userNumArr[k]);

            for (int i = 0; i < 8; i++) {
                // 首次进入的时候指定没有遍历完
                searchOK = false;

                for (int j = 0; j < 8; j++) {


                    // 空余的个数  大于或等于  需求的个数
                    if (getEmptyCount(arr) >= inputNumber) {

                        // 空闲
                        if (arr[i][j] == 0) {
                            // 强势插入
                            inputNumber--;
                            // 标记一下   哪个序号占用的就把结果标记为哪个序号
                            arr[i][j] = k + 1;
                        }

                    } else {
                        //  空间不足

                        //忍住。这里不能输出
                        //System.out.print(false+" ");
                        resultOne.add(false);
                        searchOK = true;
                        break;
                    }


                    if (inputNumber <= 0) {

                        // 忍住，这里也不能输出
                        //  System.out.print(i * 8 + j + " ");
                        resultOne.add(i * 8 + j);
                        searchOK = true;
                        break;
                    }

                }
                if (searchOK) {
                    break;
                }
            }
        }


        // 第三行用户输入的东西，就是要显示哪一个的占用情况
        String nextLine = scanner.nextLine();

        // 获得用户输入的序号   比如p3  ->  3
        Integer orderNum = Integer.parseInt(nextLine.substring(1));

        // 输出第一行的结果
        for (Object object : resultOne) {
            System.out.print(object + " ");
        }
        // 换行
        System.out.println();

        // 遍历得到用户输入的数字的 对应的序号
        // 这里要加一个判断，如果一个都没有输出的话，就输出false
        Integer outPutCount = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (arr[i][j] == orderNum) {
                    System.out.print(i * 8 + j + " ");
                    outPutCount++;
                }
            }
        }
        if (outPutCount == 0) {
            System.out.print(false);
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
