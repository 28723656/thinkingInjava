package com.java.lesson05.test02;

public class ThisTest {

    int i=0;

    //  返回当前对象，这个是以前不知道的
    ThisTest increment(){
        i++;
        return this;
    }

    public static void main(String[] args) {
        ThisTest test = new ThisTest();
        ThisTest test1 = test.increment();
        ThisTest test2 = test1.increment();
        System.out.println(test1==test2);
    }
}
