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


}
