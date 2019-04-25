package com.java.lesson20Thread.test01;

public class MoreBasicThreads {
    public static void main(String[] args) {

        for(int i=0;i<500;i++){
            new Thread(new LiftOff()).start();
        }

    }
}
