package com.sourceit.homework.task03;

/**
 * Created by judge on 14.02.2015.
 */
public class SumNum {
    public static void main(String[] args) {
        int k, k2, k1, i1, Sum1;
        double  m, i, j, Num, Sum;
        Num = 3343; //writeln number
        Sum = 0;
        i = 0;
        k = 1;
        k1 = 1;

        while (i < k) {
            i++;
            j = Math.pow(10, i);
            m = Num / j;
            Sum = Sum + (10 * (m - (int) m));

            if (m >= 1) k = k + 1;
            else
                k1 = k;}
    Sum=(int)Sum-1;
            System.out.println(Sum);

        }
    }












