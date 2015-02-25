package com.sourceit.homework.task05;

/**
 * Created by judge on 25.02.2015.
 */
public class SchoolBase {
    public static void main(String[] args) {
        Person p1= new Person(23, "Vasya", "men");
        Teacher t1 = new Teacher( "Olga",35,"women",100,"History");
        Student s1= new Student("Vasya", 23,"men","23265jk",50);
        CollegeStudent c1= new CollegeStudent("Ric",26,"men","2365y",3.5, 5 ,"c hemistry" );

        Person p[]= {p1,t1,s1,c1} ;

        for(int i=0; i<p.length; i++){

            System.out.println(p[i].toString());
        }
    }

}

