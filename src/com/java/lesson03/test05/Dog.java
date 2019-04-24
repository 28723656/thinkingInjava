package com.java.lesson03.test05;

public class Dog {
    String name;
    String says;

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        Dog dog2 = new Dog();

        dog1.name = "spot";
        dog1.says = "Ruff!";

        dog2.name = "scruffy";
        dog2.says = "Wurf!";

        System.out.println("dog1:"+dog1.name+"-"+dog1.says);
        System.out.println("dog2:"+dog2.name+"-"+dog2.says);

        Dog newDog = new Dog();
        newDog = dog1;

        System.out.println("==:"+(newDog == dog1));
        System.out.println("equals:"+newDog.equals(dog1));

    }

}
