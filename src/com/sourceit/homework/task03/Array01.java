package com.sourceit.homework.task03;

import java.util.Random;

/**
 * Created by judge on 15.02.2015.
 */
public class Array01 {
    public static void main(String[] args) {
        int arr[][]=new int [5][8];
        Random random = new Random();
        final int a=5;
        final int b=99;
        for (int i=1; i<5; i++){
            for (int j=1; j<8; j++){
                arr[i][j]=(int) (Math.random()*a+Math.random()*b);
                System.out.println(arr[i][j]);
            }
        }
    }
}



