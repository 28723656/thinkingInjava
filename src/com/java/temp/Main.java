package com.java.temp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int amax1Test = 0, max2Test = 0, number;
        List<String> alistTest=new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int min1Test = number = sc.nextInt();

        ProcessTest[] pros = new ProcessTest[number];
        for (int i = 0; i < number; i++) {
            // 录入
            pros[i] = new ProcessTest(sc.next(), sc.nextInt(), sc.nextInt());
            if (pros[i].priorityTest > amax1Test) {
                amax1Test = pros[i].priorityTest;
            }
            if (pros[i].priorityTest < min1Test) {
                min1Test = pros[i].priorityTest;

            }
            if (pros[i].timeTest > max2Test) {
                max2Test = pros[i].timeTest;
            }
        }
        int max = amax1Test > max2Test ? amax1Test : max2Test;
        for (int j = max; j >= min1Test; j--) {
            for (int i = 0; i < number; i++) {

                if (pros[i].priorityTest == j && pros[i].timeTest > 0) {
                    alistTest.add(pros[i].nameTest);

                    pros[i].timeTest--;
                    pros[i].priorityTest--;
                }
            }
        }
        System.out.println(alistTest.get(alistTest.size()-1));
    }

    static class ProcessTest {
        String nameTest;
        int priorityTest;
        int timeTest;

        public ProcessTest(String nameTest, int priorityTest, int timeTest) {
            this.nameTest = nameTest;
            this.priorityTest = priorityTest;
            this.timeTest = timeTest;
        }
    }
}
