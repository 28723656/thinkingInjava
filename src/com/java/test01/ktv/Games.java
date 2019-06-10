package com.java.test01.ktv;

import java.util.*;

/**
 * @author 风往西边吹丶
 * @create 2019-06-09 23:29
 */
public class Games {

    public static void main(String[] args) {

        finalResult(3,false);
        finalResult(3,true);

    }


    // 算出最后的结果  参数一 参加人数   参数二 时候开始猜测癞子
    public static void finalResult(Integer personNum,boolean flag){

        List<List<Dice>> allPlayers = new ArrayList<>();
        // 1.求出2个玩家的所有可能性
        List<Dice> playerA = getAllChance();
        List<Dice> playerB = getAllChance();
        List<Dice> playerC = getAllChance();
        allPlayers.add(playerA);
        allPlayers.add(playerB);
        allPlayers.add(playerC);


        int num4_1WinCount = 0;
        int num4_2WinCount = 0;

        int num5_1WinCount = 0;
        int num5_2WinCount = 0;

        int num6_1WinCount = 0;
        int num6_2WinCount = 0;

        int num7_2WinCount = 0;

        int num8_2WinCount = 0;

        int num9_2WinCount = 0;

        int totalCount = 0;


        // 3个2 我说开 赢的概率
        int count = 0;
        for(int i=0;i<allPlayers.get(0).size();i++){
            count++;

            Dice diceA = allPlayers.get(0).get(i);
            //   3 3 4 1 2
            //  返回  map 1 1   2 1   3 2   4 1  5 0  6 0
            Map<Integer,Integer> mapA =countMapCountToCount(diceA);

            for(int j= 0;j<allPlayers.get(1).size();j++){

                Dice diceB = allPlayers.get(1).get(j);
                //   3 3 4 1 2
                //  返回  map 1 1   2 1   3 2   4 1  5 0  6 0
                Map<Integer,Integer> mapB = countMapCountToCount(diceB);

                for(int k = 0;k<allPlayers.get(2).size();k++){
                    Dice diceC = allPlayers.get(2).get(k);
                    //   3 3 4 1 2
                    //  返回  map 1 1   2 1   3 2   4 1  5 0  6 0
                    Map<Integer,Integer> mapC = countMapCountToCount(diceC);


                    // 判断赢得概率  统计3个2开  赢得概率
                    // 1.1 得到2个玩家 2的个数

                    int initNum1 = mapA.get(1)+mapB.get(1)+mapC.get(1);
                    int num1 = flag?0:mapA.get(1)+mapB.get(1)+mapC.get(1);

                    int num2 = mapA.get(2)+mapB.get(2)+mapC.get(2);


                    totalCount ++;

                    // 4个的情况
                    if(initNum1<4){
                        num4_1WinCount ++;
                    }
                    if(num2+num1<4){
                        num4_2WinCount ++;
                    }


                    // 5个的情况
                    if(initNum1<5){
                        num5_1WinCount ++;
                    }
                    if(num2+num1<5){
                        num5_2WinCount ++;
                    }

                    // 6个的情况
                    if(initNum1<6){
                        num6_1WinCount ++;
                    }
                    if(num2+num1<6){
                        num6_2WinCount ++;
                    }

                    if(num2+num1<7){
                        num7_2WinCount ++;
                    }

                    if(num2+num1<8){
                        num8_2WinCount ++;
                    }
                    if(num2+num1<9){
                        num9_2WinCount ++;
                    }


                }


            }

                System.out.println("执行了"+count+"/"+allPlayers.get(0).size()+"次，当前进度"+String.format("%.2f",count*1.00/allPlayers.get(0).size()*100)+"%");


        }

        if(flag){
            System.out.println("开局猜测癞子个数的情况：-----------");
            System.out.println("4个1赢的概率："+String.format("%.2f",num4_1WinCount*1.00/totalCount*100)+"%");
            System.out.println("5个1赢的概率："+String.format("%.2f",num5_1WinCount*1.00/totalCount*100)+"%");
            System.out.println("6个1赢的概率："+String.format("%.2f",num6_1WinCount*1.00/totalCount*100)+"%");
            System.out.println("----------------------");
        }else{
            System.out.println("开局不测癞子个数的情况：-----------");
        }
        System.out.println("4个2赢的概率："+String.format("%.2f",num4_2WinCount*1.00/totalCount*100)+"%");
        System.out.println("5个2赢的概率："+String.format("%.2f",num5_2WinCount*1.00/totalCount*100)+"%");
        System.out.println("6个2赢的概率："+String.format("%.2f",num6_2WinCount*1.00/totalCount*100)+"%");
        System.out.println("7个2赢的概率："+String.format("%.2f",num7_2WinCount*1.00/totalCount*100)+"%");
        System.out.println("8个2赢的概率："+String.format("%.2f",num8_2WinCount*1.00/totalCount*100)+"%");
        System.out.println("9个2赢的概率："+String.format("%.2f",num9_2WinCount*1.00/totalCount*100)+"%");
        System.out.println("---------------------------------------------------------------------------");
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


    // 传入一个Dice对象，和数字，返回这个数字出现的次数   3 3 4 1 2
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


    // 统计一个对象中  1，2，3，4，5，6出现的个数
    public static Map<Integer,Integer> countMapCountToCount(Dice dice){
        //   3 3 4 1 2
        //  返回  map 1 1   2 1   3 2   4 1  5 0  6 0
        Map<Integer,Integer> map = new HashMap<>();
        map.put(1, numberCount(dice, 1));
        map.put(2, numberCount(dice, 2));
        map.put(3, numberCount(dice, 3));
        map.put(4, numberCount(dice, 4));
        map.put(5, numberCount(dice, 5));
        map.put(6, numberCount(dice, 6));
        return map;
    }

}
