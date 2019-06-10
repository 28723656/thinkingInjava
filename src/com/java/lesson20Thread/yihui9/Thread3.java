package com.java.lesson20Thread.yihui9;

import java.util.ArrayList;
import java.util.Scanner;

public class Thread3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer num = scanner.nextInt();

        ArrayList<String[]> stringArrayList = new ArrayList<>();

        ArrayList<String> nameList = new ArrayList<>();

        ArrayList<Integer> priorityList = new ArrayList<>();

        ArrayList<Integer> leftTimeList = new ArrayList<>();


        Integer runTimes = 0;


            for (int i = 0; i < num; i++) {
                String thread1_1 =  scanner.next();
                int thread1_2 =  scanner.nextInt();
                int thread1_3 = scanner.nextInt();


                String tempStr = thread1_1+" "+thread1_2+" "+thread1_3;
                stringArrayList.add(tempStr.split(" "));
            }


        for (int i = 0; i < stringArrayList.size(); i++) {
            runTimes += Integer.parseInt(stringArrayList.get(i)[2]);
            nameList.add(stringArrayList.get(i)[0]);
            priorityList.add(Integer.parseInt(stringArrayList.get(i)[1]));
            leftTimeList.add(Integer.parseInt(stringArrayList.get(i)[2]));
        }


        while (runTimes > 0) {
            Integer orderNum = getMaxFromList(priorityList);
            System.out.print(nameList.get(orderNum) + " ");
            priorityList.set(orderNum, priorityList.get(orderNum) - 1);
            leftTimeList.set(orderNum, leftTimeList.get(orderNum) - 1);
            runTimes--;
        }


    }



    public static Integer getMaxFromList(ArrayList<Integer> list) {

        if (list.size() > 0 && list != null) {

            int count = 0;
            int max = list.get(0);
            for (int i = 0; i < list.size(); i++) {
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
