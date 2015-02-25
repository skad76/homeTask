package com.sourceit.homework.task05;

import java.util.concurrent.Callable;

/**
 * Created by judge on 22.02.2015.
 */

    public class Person {
    int age;
    String name;
    String gender;

    Person(int age, String name,String gender){
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {

        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}







