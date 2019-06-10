package com.java.lesson20Thread.yihui9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ccccc1 = sc.nextInt();
        int numberCount = sc.nextInt();
        Process[] whatPro = new Process[numberCount];
        int headShoot = 0;
        for (int i = 0; i < numberCount; i++) {
            whatPro[i] = new Process(sc.next(), sc.nextInt());
        }
        int tempIndex=0;
        int countNumber=0;
        int testTimes = sc.nextInt();
        int flag1=0;

        boolean breakTwoFor = false;
        for (int j=0;j<numberCount*testTimes&&flag1!=1;j++) {
            for(int i=0;i<numberCount;i++) {
                if(whatPro[i].spendTime>0) {
                    whatPro[i].spendTime-=ccccc1;
                    countNumber++;
                    if(countNumber==testTimes) {
                        breakTwoFor = true;
                        flag1=1;
                        tempIndex=i;
                        break ;
                    }
                }
            }
            if(breakTwoFor){
                break;
            }
        }

        String threadName=flag1==1?whatPro[tempIndex].threadName:"over";
        System.out.println(threadName);
    }



    static class Process {
        String threadName;
        int spendTime;

        public Process(String threadName, int spendTime) {
            this.threadName = threadName;
            this.spendTime = spendTime;
        }
    }
}
