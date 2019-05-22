package com.java.lesson20Thread.yihui;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainThread {
    public static void main(String[] args) {
        ExecutorService exec = Executors.newCachedThreadPool();

        // 创建5个线程
        ThreadEntity thread1 = new ThreadEntity("线程1","0", 2,1,"R");
        ThreadEntity thread2 = new ThreadEntity("线程2","k4",3,5,"R");
        ThreadEntity thread3 = new ThreadEntity("线程3","k5",1,3,"R");
        ThreadEntity thread4 = new ThreadEntity("线程4","k3",2,4,"R");
        ThreadEntity thread5 = new ThreadEntity("线程5","k1",4,2,"R");

        // 设置优先级
        thread1.setPriority(thread1.getPriority());
        thread2.setPriority(thread2.getPriority());
        thread3.setPriority(thread3.getPriority());
        thread4.setPriority(thread4.getPriority());
        thread5.setPriority(thread5.getPriority());


        // 启动5个线程
        exec.execute(thread2);
        exec.execute(thread1);
        exec.execute(thread3);
        exec.execute(thread4);
        exec.execute(thread5);

        exec.shutdown();
    }
}
