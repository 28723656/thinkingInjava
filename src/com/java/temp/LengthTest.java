package com.java.temp;

import java.util.Comparator;

public class LengthTest {


    public static void main(String[] args) {

        Student student1 = new Student("张三",12);
        Student student2 = new Student("李四",32);
        Student student3 = new Student("王五",2);

        Comparator<Student> studentComparator = Comparator.comparingInt(s ->s.getAge());

        int compare = studentComparator.compare(student1, student2);
        int compare2 = studentComparator.compare(student1, student3);
        int compare3 = studentComparator.compare(student1, student1);
        System.out.println(compare);
        System.out.println(compare2);
        System.out.println(compare3);

    }
}
