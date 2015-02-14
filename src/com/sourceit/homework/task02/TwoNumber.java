package com.sourceit.homework.task02;

/**
 * Created by judge on 14.02.15.
 */
public class TwoNumber {
    public static void main(String[] args) {
        double n, m, Xn, Xm;
        int i=10;
        n=8.34;
        m=12.35;
        Xn=Math.abs(i-n);
        Xm=Math.abs(i-m);
        if (Xm<Xn)
        System.out.println("ближайшее число " +m);
        if (Xm>Xn)
        System.out.println("ближайшее число " +n);
    }
}
