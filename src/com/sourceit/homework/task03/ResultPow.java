package com.sourceit.homework.task03;

/**
 * Created by judge on 17.02.2015.
 */
public class ResultPow {



    static int pow(int i, int n) {

        if (i == 0) return 1;
               else
            return n*pow(i-1, n);}

    public static void main(String[] args) {
        System.out.println(pow(8, 2));


    }

    }

