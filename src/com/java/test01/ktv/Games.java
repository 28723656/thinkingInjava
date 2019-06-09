package com.java.test01.ktv;

import java.util.*;

/**
 * @author 风往西边吹丶
 * @create 2019-06-09 23:29
 */
public class Games {

    public static void main(String[] args) {

        // 1.求出2个玩家的所有可能性
        List<Dice> playerA = getAllChance();
        List<Dice> playerB = getAllChance();


        int num3_2WinCount = 0;
        int num3_3WinCount = 0;
        int num3_4WinCount = 0;
        int num3_5WinCount = 0;
        int num3_6WinCount = 0;

        int num4_2WinCount = 0;
        int num4_3WinCount = 0;
        int num4_4WinCount = 0;
        int num4_5WinCount = 0;
        int num4_6WinCount = 0;

        int num5_2WinCount = 0;
        int num5_3WinCount = 0;
        int num5_4WinCount = 0;
        int num5_5WinCount = 0;
        int num5_6WinCount = 0;

        int num6_2WinCount = 0;
        int num6_3WinCount = 0;
        int num6_4WinCount = 0;
        int num6_5WinCount = 0;
        int num6_6WinCount = 0;

        int num7_2WinCount = 0;
        int num7_3WinCount = 0;
        int num7_4WinCount = 0;
        int num7_5WinCount = 0;
        int num7_6WinCount = 0;

        int totalCount = 0;

        // 3个2 我说开 赢的概率
        for(int i=0;i<playerA.size();i++){

            Dice diceA = playerA.get(i);

            //   3 3 4 1 2
            //  返回  map 1 1   2 1   3 2   4 1  5 0  6 0
            Map<Integer,Integer> mapA = new HashMap<>();
            mapA.put(1, numberCount(diceA, 1));
            mapA.put(2, numberCount(diceA, 2));
            mapA.put(3, numberCount(diceA, 3));
            mapA.put(4, numberCount(diceA, 4));
            mapA.put(5, numberCount(diceA, 5));
            mapA.put(6, numberCount(diceA, 6));


            Dice diceB = playerB.get(i);
            //   3 3 4 1 2
            //  返回  map 1 1   2 1   3 2   4 1  5 0  6 0
            Map<Integer,Integer> mapB = new HashMap<>();
            mapB.put(1, numberCount(diceB, 1));
            mapB.put(2, numberCount(diceB, 2));
            mapB.put(3, numberCount(diceB, 3));
            mapB.put(4, numberCount(diceB, 4));
            mapB.put(5, numberCount(diceB, 5));
            mapB.put(6, numberCount(diceB, 6));

            // 判断赢得概率  统计3个2开  赢得概率
            // 1.1 得到2个玩家 2的个数

            int num1 = mapA.get(1)+mapB.get(1);

            int num2 = mapA.get(2)+mapB.get(2);
            int num3 = mapA.get(3)+mapB.get(3);
            int num4 = mapA.get(4)+mapB.get(4);
            int num5 = mapA.get(5)+mapB.get(5);
            int num6 = mapA.get(6)+mapB.get(6);


            totalCount ++;
            // 3个的情况
            if(num2+num1<3){
                num3_2WinCount ++;
            }
            if(num3+num1<3){
                num3_3WinCount ++;
            }
            if(num4+num1<3){
                num3_4WinCount ++;
            }
            if(num5+num1<3){
                num3_5WinCount ++;
            }
            if(num6+num1<3){
                num3_6WinCount ++;
            }


            // 4个的情况
            if(num2+num1<4){
                num4_2WinCount ++;
            }
            if(num3+num1<4){
                num4_3WinCount ++;
            }
            if(num4+num1<4){
                num4_4WinCount ++;
            }
            if(num5+num1<4){
                num4_5WinCount ++;
            }
            if(num6+num1<4){
                num4_6WinCount ++;
            }


            // 5个的情况
            if(num2+num1<5){
                num5_2WinCount ++;
            }
            if(num3+num1<5){
                num5_3WinCount ++;
            }
            if(num4+num1<5){
                num5_4WinCount ++;
            }
            if(num5+num1<5){
                num5_5WinCount ++;
            }
            if(num6+num1<5){
                num5_6WinCount ++;
            }

            // 6个的情况
            if(num2+num1<6){
                num6_2WinCount ++;
            }
            if(num3+num1<6){
                num6_3WinCount ++;
            }
            if(num4+num1<6){
                num6_4WinCount ++;
            }
            if(num5+num1<6){
                num6_5WinCount ++;
            }
            if(num6+num1<6){
                num6_6WinCount ++;
            }


            // 7个的情况
            if(num2+num1<7){
                num7_2WinCount ++;
            }
            if(num3+num1<7){
                num7_3WinCount ++;
            }
            if(num4+num1<7){
                num7_4WinCount ++;
            }
            if(num5+num1<7){
                num7_5WinCount ++;
            }
            if(num6+num1<7){
                num7_6WinCount ++;
            }

        }

        System.out.println("3个2赢的概率："+String.format("%.2f",num3_2WinCount*1.00/totalCount*100)+"%");
        System.out.println("4个2赢的概率："+String.format("%.2f",num4_2WinCount*1.00/totalCount*100)+"%");
        System.out.println("5个2赢的概率："+String.format("%.2f",num5_2WinCount*1.00/totalCount*100)+"%");
        System.out.println("6个2赢的概率："+String.format("%.2f",num6_2WinCount*1.00/totalCount*100)+"%");
        System.out.println("7个2赢的概率："+String.format("%.2f",num7_2WinCount*1.00/totalCount*100)+"%");
    }



    // 获取用户所有的可能性
    public static List<Dice> getAllChance(){
        List<Dice> player = new ArrayList<>();
        for(int a= 1;a<=6;a++){
            for (int b = 1;b<=6;b++){
                for (int c = 1;c<=6;c++){
                    for (int d = 1;d<=6;d++){
                        for (int e = 1;e<=6;e++){
                            if(isOkDice(a,b,c,d,e)){
                                Dice dice = new Dice(a,b,c,d,e);
                                player.add(dice);
                            }
                        }
                    }
                }
            }
        }
        return player;
    }

    // 判断是否可用  如果是顺子，不可用
    public static  boolean isOkDice(int a,int b,int c,int d,int e){
        List<Integer> listDice = Arrays.asList(a,b,c,d,e);
        Set<Integer> setDice = new HashSet<>();
        setDice.addAll(listDice);
        if(setDice.size()<5){
            return true;
        }
        return false;
    }


    // 传入一个Dice对象，和数字，返回这个数字出现的次数
    public static  Integer numberCount(Dice dice,Integer num){
        int count = 0;
       if(dice.getOne() == num){
           count++;
       }
        if(dice.getTwo() == num){
            count++;
        }
        if(dice.getThree() == num){
            count++;
        }
        if(dice.getFour() == num){
            count++;
        }
        if(dice.getFive() == num){
            count++;
        }
        return count;
    }

}
