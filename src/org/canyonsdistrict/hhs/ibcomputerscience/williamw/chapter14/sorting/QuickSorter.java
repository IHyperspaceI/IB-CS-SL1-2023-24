package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.sorting;

import org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.ArrayUtil;

public class QuickSorter {
    public static void sort(int[] values) {
        sort(values, 0, values.length - 1);
    }

    private static void sort(int[] values, int from, int to) {
        if (from >= to) {
            return;
        }

        int partition = partition(values, from, to);
        sort(values, from, partition);
        sort(values, partition + 1, to);
    }

    private static int partition(int[] values, int from, int to) {
        int pivot = values[from];
        int i = from - 1;
        int j = to + 1;

        while (i < j) {
            i++;
            while (values[i] < pivot) {
                i++;
            }
            j--;
            while (values[j] > pivot) {
                j--;
            }
            if (i < j) {
                ArrayUtil.swap(values, i, j);
            }
        }

        return j;
    }
}
