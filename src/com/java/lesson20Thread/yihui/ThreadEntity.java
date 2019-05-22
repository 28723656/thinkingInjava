package com.java.lesson20Thread.yihui;

public class ThreadEntity extends Thread {


    private String name;
    private String point ;
    private int time;
    private int priority;
    private String status;

    public ThreadEntity(String name, String point, int time, int priority, String status) {
        this.name = name;
        this.point = point;
        this.time = time;
        this.priority = priority;
        this.status = status;
    }

    public ThreadEntity() {
    }

    private int countNum = 10;

    private static int taskCount = 0;
    private final int id =taskCount++;

    @Override
    public void run() {
        while (time > 0){


            // 要求运行时间减一

            time --;
            if(time == 0){
                status = "E";
            }
            priority --;
          /*  if(priority>1){
                setPriority(priority-1);
            }*/
            System.out.println("当前线程："+name+"\t运行时间："+time+"\t优先级："+priority+"\t\t\t状态："+status);


            Thread.yield();
        }
    }
}
