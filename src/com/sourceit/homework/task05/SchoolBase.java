package com.sourceit.homework.task05;

/**
 * Created by judge on 25.02.2015.
 */
public class SchoolBase {
    public static void main(String[] args) {
        Person p1= new Person(27, "Coach Bob", "men");
        Teacher t1 = new Teacher( 35,"Duke Java","men",5000,"Computer Science");
        Student s1= new Student(23,"Lynne Brooke", "women","HS95129",3.5);
        CollegeStudent c1= new CollegeStudent(18, "Ima Frosh","women","USB123", 4.0, 1, "English" );

        Person p[]= {p1,t1,s1,c1} ;

        for(int i=0; i<p.length; i++){

            System.out.println(p[i].toString());
        }
    }

}

