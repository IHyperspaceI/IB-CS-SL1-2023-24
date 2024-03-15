package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.searching;

public class LinearSearcher {
    public static int search(int[] values, int value) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == value) {
                return i;
            }
        }
        return -1;
    }
}
