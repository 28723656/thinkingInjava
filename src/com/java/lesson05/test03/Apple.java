package com.java.lesson05.test03;

public class Apple {
    String appleStatus = "没有剥皮";
    Apple getPeeled(){
        return Peeler.peel(this);

    }
}
