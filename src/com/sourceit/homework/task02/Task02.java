package com.sourceit.homework.task02;

/**
 * Created by judge on 13.02.2015.
 */
public class Task02 {
    public static void main(String[] args) {


    double x, y, z, SumC1, SumC2, SumC;
     y=44;
    x=y/2;
        z=x-(int)x;
        if (z>0)
        System.out.println("число нечетное");
        if (z<=0)
        System.out.println("число четное");
        SumC1=(int)y/10;
        SumC2=y-SumC1*10;
        SumC=SumC1+SumC2;
        System.out.println(SumC);

}
}