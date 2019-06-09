package com.java.lesson20Thread.yihui8;

import java.util.ArrayList;
import java.util.Scanner;

public class Thread2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer num = Integer.parseInt(scanner.nextLine());

        // 用户输入列表
        ArrayList<String[]> stringArrayList = new ArrayList<>();

        // 数字大小比较数组
        ArrayList<Integer> numList = new ArrayList<>();


        if (num > 100 || num < 0) {
            System.out.println("0-100,ok?");
        } else {
            for (int i = 0; i < num; i++) {
                String tempStr = scanner.nextLine();
                stringArrayList.add(tempStr.split(" "));
            }
        }

        for (int i = 0; i < stringArrayList.size(); i++) {
            numList.add(Integer.parseInt(stringArrayList.get(i)[1]));
        }
        Integer count = Util.getMaxFromList(numList);
        System.out.println(stringArrayList.get(count)[0]);


    }


}
