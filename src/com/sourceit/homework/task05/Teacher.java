package com.sourceit.homework.task05;

/**
 * Created by judge on 25.02.2015.
 */
public class Teacher extends Person {

    double salary;
        String subject;

    Teacher(int age, String name,  String gender, double salary, String subject) {
        super(age, name, gender);
        setSalary(salary);
        setSubject(subject);
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getSalary() {

        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

