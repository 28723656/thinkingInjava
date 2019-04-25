package com.java.lesson20Thread.test01;

public class LiftOff implements Runnable {

    private int countNum = 10;

    private static int taskCount = 0;
    private final int id =taskCount++;

    public String status(){
        return id+"("+countNum+")";
    }

    @Override
    public void run() {
        while (countNum-- > 0){
            System.out.println(status());
            Thread.yield();
        }
    }
}
