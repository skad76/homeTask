package com.sourceit.homework.task02.PersonInfo;

/**
 * Created by judge on 14.02.2015.
 */
public class PersonInfo {
    long storage;

    public void setAge(int newAge){
        setParam(newAge, 48);
    }
    public int getAge(){
        return getParam(48);
    }
    public void setWeight(int newWeight){
        setParam(newWeight, 32);
    }
    public int getWeight(){
        return getParam(32);
    }
    public void setHeight(int newHeight){
        setParam(newHeight, 16);
    }
    public int getHeight(){
        return getParam(16);
    }
    public void setYear(int newYear){
        setParam(newYear, 0);
    }
    public int getYear(){
        return getParam(0);
    }


    public void setParam(int newParam, int shift) {
        long mask = 0xFFFFl<<shift;
        mask= ~mask;
        storage=storage&mask;
        long s=(long)newParam<<shift;
        storage=storage|s;
    }

        public int getParam(int shift) {
            long newParam =storage>>>shift;
            newParam = newParam&0xFFFF;
            return  (int)newParam;
        }

}
