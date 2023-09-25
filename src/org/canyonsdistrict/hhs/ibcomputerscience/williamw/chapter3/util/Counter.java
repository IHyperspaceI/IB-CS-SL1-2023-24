package org.canyonsdistrict.hhs.ibcomputerscience.chapter3.util;

public class Counter {
    // private is an access specifier
    private int count;

    public void click(){
        count++;
    }

    public int getCount(){
        return count;
    }
}