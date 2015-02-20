package com.sourceit.homework.task04;

/**
 * Created by judge on 20.02.2015.
 */
public class Recurs01 {
    static int Sum(int n) {


        if (n == 0) return 0;
        else if (n==1) return 1;

        else
            return n=n+Sum(n - 1);}

    public static void main(String[] args) {


        System.out.println(Sum(345)); }
}

