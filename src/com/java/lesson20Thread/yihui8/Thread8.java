package com.java.lesson20Thread.yihui8;

import java.util.ArrayList;
import java.util.Scanner;

public class Thread8 {
    public static void main(String[] args) {

        // 处理输入
        Scanner scanner = new Scanner(System.in);
        //第一行的数 k*k的矩阵
        Integer row =Integer.parseInt(scanner.nextLine().trim());

        // k*k  -1表示占用 0表示空闲
        int[][] arr = new int[row][row];



        // 获取 k*k以内的所有素数
        ArrayList<Integer> numList = Util.getPrimeNumberList(row*row);

        // 初始化   素数置为-1，其他空闲的置位0
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < row; j++) {
               if( numList.contains(i*row+j)){
                   arr[i][j] = -1;
               }else{
                   arr[i][j] = 0;
               }
            }
        }



        //输入第二行： 毫无意义的一个数
        scanner.nextLine();

        // 输入第三行   比如  3 3 3
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
                    if (Util.getEmptyCount(arr) >= inputNumber) {

                        // 空闲
                        if (arr[i][j] == 0) {
                            // 强势插入
                            inputNumber--;
                            // 标记一下   哪个序号占用的就把结果标记为哪个序号
                            arr[i][j] = k+1;
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


        // 输入第四行： 比如输入 2,
        Integer lineThree = Integer.parseInt(scanner.nextLine().trim());


        //输入第五行    如果第四行输入2   第五行就输入2个  比如：p2 p3   就是要分别显示的占用情况
        String[] nextLine = scanner.nextLine().split(" ");


        // 输出的第一行
        // 输出第一行的结果
        for(Object object :resultOne){
            System.out.print(object+" ");
        }
        // 换行
        System.out.println();


        for(int m=0;m<nextLine.length;m++){
            // 获得用户输入的序号
            Integer orderNum = Integer.parseInt(nextLine[m].substring(1));

            // 遍历得到用户输入的数字的 对应的序号
            // 这里要加一个判断，如果一个都没有输出的话，就输出false
            Integer outPutCount = 0;
            for(int i=0;i<8;i++){
                for(int j=0;j<8;j++){
                    if(arr[i][j]==orderNum){
                        System.out.print(i*8+j+" ");
                        outPutCount++;
                    }
                }
            }
            if(outPutCount ==0){
                System.out.print(false);
            }

            // 加一个换行
            System.out.println();

        }




    }



}
