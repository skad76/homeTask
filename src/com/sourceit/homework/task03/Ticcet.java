package com.sourceit.homework.task03;

/**
 * Created by judge on 16.02.2015.
 */
public class Ticcet {
    public static void main(String[] args) {
        int i, k, Num;
        double s, s1, s2, s3;
        k = 0;

        for (Num = 1; Num < 1000; Num++) {
            s1 = (int) Num / 100;
            s2 = Num / 10 - (Num / 100) * 10;
            s3 = Num - (Num / 10) * 10;
            s = s1 + s2 + s3;
          for (i=0;i<28;i++)
            if (s==i) k=k+1;
        }
            System.out.println(k);



    }
}



