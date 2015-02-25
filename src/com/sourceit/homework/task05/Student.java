package com.sourceit.homework.task05;

/**
 * Created by judge on 25.02.2015.
 */
public class Student extends Person {
    double gpa;
    String idNumber;

    Student(String name, int age, String gender, String idNumber, double gpa) {
        super(age, name, gender);
        setIdNumber(idNumber);
        setGpa(gpa);
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getGpa() {

        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
