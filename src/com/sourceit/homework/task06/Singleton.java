package com.sourceit.homework.task06;

/**
 * Created by judge on 24.02.2015.
 */
public class Singleton {
    private static class InnerClass {
        static Singleton INSTANCE = new Singleton();

        public Singleton getInstance() {
            return InnerClass.INSTANCE;
        }

        private Singleton() {
        }

    }
}
