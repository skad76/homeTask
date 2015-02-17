package com.sourceit.homework.task03;

/**
 * Created by judge on 16.02.2015.
 */
public class Time {
    public static void main(String[] args) {
        int TimeHour, TimeMin, h1, h2, m1, m2, k;
        k=0;
        for (TimeHour=0; TimeHour<13; TimeHour++){
            for (TimeMin=0; TimeMin<61; TimeMin++){
                if (TimeHour<10) h1=0;
                else
                h1=(int)TimeHour/10;
               if (TimeHour<10) h2=TimeHour;
               else h2=TimeHour-10;
               if (TimeMin<10) m1=0;
                else
               m1=(int)TimeMin/10;
                m2=TimeMin-((int)TimeMin/10)*10;
                if ((h1==m2)&(h2==m1)) k=k+1;
            }
        }
                System.out.println(k);



    }
}
