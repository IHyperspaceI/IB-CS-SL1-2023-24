package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.searching;

public class BinarySearcher {
    public static int search(int[] values, int value) {
        return search(values, 0, values.length - 1, value);
    }

    private static int search(int[] values, int low, int high, int value) {
        if (low > high) {
            return -1;
        }

        int middle = (low + high) / 2;

        if (values[middle] == value) {
            return middle;
        }
        if (values[middle] < value) {
            return search(values, middle + 1, high, value);
        } else {
            return search(values, low, middle - 1, value);
        }
    }
}
