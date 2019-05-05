package com.java.lesson08.test03;

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field = "+sup.field+
                "\tsup.getField()="+sup.getField());

        Sub sub = new Sub();
        System.out.println("sub.field = "+sub.field+
                "\tsub.getField()="+sub.getField()+
                "\tsub.getSuperField()="+sub.getSuperField());

    }
}
