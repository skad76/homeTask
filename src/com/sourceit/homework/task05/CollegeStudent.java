package com.sourceit.homework.task05;

/**
 * Created by judge on 25.02.2015.
 */
public class CollegeStudent extends Student{
    int year;
    String major;

    CollegeStudent(int age, String name,  String gender, String idNumber, double gpa,int year,String major) {
        super(age, name,  gender, idNumber, gpa);
        setYear(year);
        setMajor(major);
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getYear() {

        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
