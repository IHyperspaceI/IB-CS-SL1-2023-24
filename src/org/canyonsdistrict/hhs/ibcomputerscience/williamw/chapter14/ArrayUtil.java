package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14;

import java.util.Random;

public class ArrayUtil {

    private static Random generator = new Random();

    public static int[] randomArray(int size, int n){
        int[] values = new int[size];
        for (int i = 0; i < values.length; i++){
            values[i] = generator.nextInt(n);
        }
        return values;
    }

    public static void swap(int[] values, int first, int second){
        var temp = values[first];
        values[first] = values[second];
        values[second] = temp;
    }
}
