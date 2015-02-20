package com.sourceit.homework.task04;

/**
 * Created by judge on 20.02.2015.
 */
public class Recurs02 {

    static int fibonacci(int n)  {
        int k=0;
        if (n==4) k=k+1;
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else

            return fibonacci(n - 1) + fibonacci(n - 2);

    }



    public static void main(String[] args) {




        System.out.println(fibonacci(15));
    }
}

