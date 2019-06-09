package com.java.test01.ktv;

/**
 * @author 风往西边吹丶
 * @create 2019-06-09 23:35
 */
public class Dice {

    private Integer one;
    private Integer two;
    private Integer three;
    private Integer four;
    private Integer five;

    public Integer getOne() {
        return one;
    }

    public void setOne(Integer one) {
        this.one = one;
    }

    public Integer getTwo() {
        return two;
    }

    public void setTwo(Integer two) {
        this.two = two;
    }

    public Integer getThree() {
        return three;
    }

    public void setThree(Integer three) {
        this.three = three;
    }

    public Integer getFour() {
        return four;
    }

    public void setFour(Integer four) {
        this.four = four;
    }

    public Integer getFive() {
        return five;
    }

    public void setFive(Integer five) {
        this.five = five;
    }

    public Dice(Integer one, Integer two, Integer three, Integer four, Integer five) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
        this.five = five;
    }

    public Dice() {
    }
}
