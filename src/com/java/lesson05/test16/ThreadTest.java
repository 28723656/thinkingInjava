package com.java.lesson05.test16;

public class ThreadTest implements Runnable {


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程启动了");
    }

    public static void main(String[] args) {
        ThreadTest t1 = new ThreadTest();
        ThreadTest t2 = new ThreadTest();

        Thread thread1 = new Thread(t1,"Thread1");
        Thread thread2 = new Thread(t1,"Thread2");

        thread1.start();
        thread2.start();

    }
}
