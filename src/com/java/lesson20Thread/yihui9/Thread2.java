package com.java.lesson20Thread.yihui9;

import java.util.ArrayList;
import java.util.Scanner;

public class Thread2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer num = scanner.nextInt();

        ArrayList<String[]> stringArrayList = new ArrayList<>();

        ArrayList<Integer> numList = new ArrayList<>();


        for (int i = 0; i < num; i++) {

            String thread1_1 =  scanner.next();
            int thread1_2 =  scanner.nextInt();
            int thread1_3 = scanner.nextInt();


            String tempStr = thread1_1+" "+thread1_2+" "+thread1_3;
            stringArrayList.add(tempStr.split(" "));
        }

        for (int i = 0; i < stringArrayList.size(); i++) {
            numList.add(Integer.parseInt(stringArrayList.get(i)[1]));
        }
        Integer count = getMaxFromList(numList);
        System.out.println(stringArrayList.get(count)[0]);


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
