package com.java.lesson20Thread.test01;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadPool {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newFixedThreadPool(6);
        for(int i=0;i<6;i++){
            exec.execute(new LiftOff());
        }


        exec.shutdown();
    }
}
