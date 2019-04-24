package com.java.lesson04.test09;

public class Fibonacci {
    public static void main(String[] args) {
        getNumbers(0);
    }

    public static  void getNumbers(Integer num){

        if(num>2){

            System.out.println("1");
            System.out.println("1");

            num = num -2;
            Integer firstNum = 1;
            Integer nextNum = 1;

            Integer newNum = 0;

            for(int i=0;i<num;i++){
                newNum = firstNum + nextNum;
                System.out.println(newNum);
                // 交换值
                firstNum = nextNum;
                nextNum = newNum;
            }
        }else {
            if(num <=0 ){
                System.out.println("请输入一个大于0的数");
            }else if(num ==1){
                System.out.println("1");
            }else if(num==2){
                System.out.println("1");
                System.out.println("1");
            }
        }


    }
}
