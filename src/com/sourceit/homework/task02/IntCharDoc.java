package com.sourceit.homework.task02;

/**
 * Created by judge on 13.02.2015.
 */
class Price {
    int Level;
    char Name;
}

public class IntCharDoc {
    public static void main(String[] args) {
        Price p1=new Price();
        Price p2=new Price();
        Price n1=new Price();
        Price n2=new Price();

        p1.Level=2;
        p2.Level=3;

        n1.Name='s';
        n2.Name='b';

        System.out.println("Level is " + n1.Name + " Price is " + p1.Level);
        System.out.println("Level is " + n2.Name + " Price is " + p2.Level);
            }


}
