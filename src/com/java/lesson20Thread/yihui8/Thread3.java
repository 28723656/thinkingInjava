package com.java.lesson20Thread.yihui8;

import java.util.ArrayList;
import java.util.Scanner;

public class Thread3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 用户输入的个数
        Integer num = Integer.parseInt(scanner.nextLine());

        // 用户输入列表
        /**
         *    [p1,1,1],[p2,2,2],[p3,3,3]
         */
        ArrayList<String[]> stringArrayList = new ArrayList<>();

        // 线程名称List
        ArrayList<String> nameList = new ArrayList<>();

        // 优先级List
        ArrayList<Integer> priorityList = new ArrayList<>();

        // 剩余时间List
        ArrayList<Integer> leftTimeList = new ArrayList<>();


        // 需要运行的时间总数
        Integer runTimes = 0;


        if (num > 100 || num < 0) {
            System.out.println("0-100,ok?");
        } else {
            for (int i = 0; i < num; i++) {
                String tempStr = scanner.nextLine();
                stringArrayList.add(tempStr.split(" "));
            }
        }


        // 获取程序总共要运行的时间,并且分别把数据纵向切割
        for (int i = 0; i < stringArrayList.size(); i++) {
            runTimes += Integer.parseInt(stringArrayList.get(i)[2]);
            nameList.add(stringArrayList.get(i)[0]);
            priorityList.add(Integer.parseInt(stringArrayList.get(i)[1]));
            leftTimeList.add(Integer.parseInt(stringArrayList.get(i)[2]));
        }


        while (runTimes > 0) {
            // 获取当前最大的优先级对应的序号
            Integer orderNum = Util.getMaxFromList(priorityList);
            // 输出当前优先级最高的一个
            System.out.print(nameList.get(orderNum) + "\t");
            // 优先级 -1   执行时间 -1   需要运行的时间 -1
            priorityList.set(orderNum, priorityList.get(orderNum) - 1);
            leftTimeList.set(orderNum, leftTimeList.get(orderNum) - 1);
            runTimes--;
        }


    }


}
