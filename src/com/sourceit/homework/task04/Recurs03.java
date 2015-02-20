package com.sourceit.homework.task04;

/**
 * Created by judge on 20.02.2015.
 */
public class Recurs03 {

    static int Sum(int n) {
        if (n==2) return n;
        else if (n==3) return n;
        else
            return  n=Sum(n-1)+2;

    }


    public static void main(String[] args) {
        System.out.println(Sum(345));

     }
}

