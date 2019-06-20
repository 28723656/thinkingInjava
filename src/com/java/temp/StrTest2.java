package com.java.temp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StrTest2 {
    public static void main(String[] args) {

        /**
         *
         *                  1                           8
         *              2          3                9     10
         *            4  5        6 7
         *
         *
         *
         */









        // --------------------------------总体节点   添加1和8

        List<Object> list = new ArrayList<>();

        //-------------------  1添加  2和3

        Map<String,Object> map1 = new HashMap<>();
        map1.put("id",1);
        List<Object> list1 = new ArrayList<>();

        // ----------------------  2添加  4和5
        Map<String,Object> map2 = new HashMap<>();

        Map<String,Object> map4 = new HashMap<>();
        map4.put("id",4);

        Map<String,Object> map5 = new HashMap<>();
        map5.put("id",5);

        map2.put("id",2);
        List<Object> list2 = new ArrayList<>();
        list2.add(map4);
        list2.add(map5);
        map2.put("children",list2);

        list1.add(map2);

        //-------------------- 3添加  6和7

        Map<String,Object> map3 = new HashMap<>();

        Map<String,Object> map6 = new HashMap<>();
        map6.put("id",6);

        Map<String,Object> map7 = new HashMap<>();
        map7.put("id",7);

        map3.put("id",3);
        List<Object> list3 = new ArrayList<>();
        list3.add(map6);
        list3.add(map7);
        map3.put("children",list3);

        list1.add(map3);
        map1.put("child",list1);

        list.add(map1);

        // 1号完结  添加8号


        // -------------------8添加  9 和10
        Map<String,Object> map8 = new HashMap<>();

        Map<String,Object> map9 = new HashMap<>();
        map9.put("id",9);

        Map<String,Object> map10 = new HashMap<>();
        map10.put("id",10);

        map8.put("id",8);
        List<Object> list8 = new ArrayList<>();
        list8.add(map9);
        list8.add(map10);
        map8.put("children",list8);

        list.add(map8);
        System.out.println(list);

    }


}
