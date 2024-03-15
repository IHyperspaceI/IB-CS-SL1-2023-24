package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.sorting;

import org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.ArrayUtil;

public class SelectionSorter {

    public static void sort(int[] values){
        for (int i = 0; i < values.length - 1; i++){
            var minPos = minimumPosition(values, i);
            ArrayUtil.swap(values, minPos, i);

        }
    }

    private static int minimumPosition(int[] values, int from){
        int minPos = from;
        for (int i = from + 1; i< values.length; i++){
            if (values[i] < values[minPos]){
                minPos = i;
            }
        }
        return minPos;
    }
}
