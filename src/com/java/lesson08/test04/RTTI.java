package com.java.lesson08.test04;

public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {
          new Useful(),
          new MoreUseful()
        };

        x[0].f();
        x[1].g();

        //  x[1].u();
    }
}
