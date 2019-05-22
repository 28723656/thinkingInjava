package com.java.lesson20Thread.yihui8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Util {

    // 获得最大的序号
    public static Integer  getMaxFromArr(int[] arr){

        if(arr!=null){
            int count = 0;
            int max = arr[0];
            for (int i = 0; i<arr.length; i++) {
                if (max < arr[i]) {
                    max = arr[i];
                    count = i;
                }
            }
            return count;
        }
        return null;
    }

    // 获得最大的序号
    public static Integer  getMaxFromList(ArrayList<Integer> list){

        if(list.size()>0 && list!=null){

            int count = 0;
            int max = list.get(0);
            for (int i = 0; i<list.size(); i++) {
                if (max < list.get(i)) {
                    max = list.get(i);
                    count = i;
                }
            }
            return count;
        }
      return null;
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


    //获取所有的素数集合
    public static  ArrayList<Integer> getPrimeNumberList(Integer maxNum) {

        ArrayList<Integer> primeNumberList = new ArrayList<>();

        boolean flag;
        for (int i = 2; i < maxNum; i++) {
            flag = false;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag == false) {
                primeNumberList.add(i);
            }
        }

        return primeNumberList;

    }




}
