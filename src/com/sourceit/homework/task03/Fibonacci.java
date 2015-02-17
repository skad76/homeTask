package com.sourceit.homework.task03;

/**
 * Created by judge on 15.02.2015.
 */
public class Fibonacci {
    public static void main(String[] args) {
        int Fibo[];
        int i,n;
        n=17;
        Fibo = new int [n];
        Fibo[1]=0;
        Fibo[2]=1;
        System.out.println(Fibo[0]);
        System.out.println(Fibo[1]);
        for (i=3;i<n;i++){
            Fibo[i]=Fibo[i-1]+Fibo[i-2];
            System.out.println(Fibo[i]);
    }
            }

}
