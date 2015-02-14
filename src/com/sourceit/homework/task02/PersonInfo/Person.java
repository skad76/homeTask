package com.sourceit.homework.task02.PersonInfo;

/**
 * Created by judge on 14.02.2015.
 */
public class Person {
    public static void main(String[] args) {
        PersonInfo pi = new PersonInfo();
        pi.setAge(15);
        pi.setWeight(20);
        pi.setHeight(40);
        pi.setYear(45);
        System.out.println(pi.getAge());
        System.out.println(pi.getWeight());
        System.out.println(pi.getHeight());
        System.out.println(pi.getYear());

    }
}
