package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.sorting;

import org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.ArrayUtil;
import org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.StopWatch;
import org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.sorting.InsertionSorter;
import org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.sorting.MergeSorter;
import org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.sorting.QuickSorter;
import org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.sorting.SelectionSorter;

public class SortApp {

    public static void main(String[] args) {
        int size = 100000;
        int n = 10_000;

        var quickValues = ArrayUtil.randomArray(size,n);
        var insertionValues = ArrayUtil.randomArray(size,n);
        var selectionValues = ArrayUtil.randomArray(size,n);
        var mergeValues = ArrayUtil.randomArray(size,n);
        var watch = new StopWatch();

        watch.start();
        QuickSorter.sort(quickValues);
        watch.stop();
        System.out.printf("Quick sort time: %d\n", watch.getElapsedTime());

        watch.reset();
        watch.start();
        InsertionSorter.sort(insertionValues);
        watch.stop();
        System.out.printf("Insertion sort time: %d\n", watch.getElapsedTime());

        watch.reset();
        watch.start();
        SelectionSorter.sort(selectionValues);
        watch.stop();
        System.out.printf("Selection sort time: %d\n", watch.getElapsedTime());

        watch.reset();
        watch.start();
        MergeSorter.sort(mergeValues);
        watch.stop();
        System.out.printf("Merge sort time: %d\n", watch.getElapsedTime());
    }
}
