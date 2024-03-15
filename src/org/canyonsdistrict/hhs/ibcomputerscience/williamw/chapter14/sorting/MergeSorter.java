package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.sorting;

public class MergeSorter {

    public static void sort(int[] values){
        //terminating condition
        if (values.length <= 1){
            return;
        }
        var first = new int[values.length/2];
        var second = new int[values.length - first.length];
        for (int i = 0; i < first.length; i++) {
            first[i] = values[i];

        }
        for (int i = 0; i < second.length; i++) {
            second[i] = values[first.length + i];
        }
        sort(first);
        sort(second);
        merge(first, second, values);
    }

    private static void merge(int[] first, int[] second, int[] values){
        int iFirst = 0;
        int iSecond = 0;
        int j = 0;

        while (iFirst < first.length && iSecond < second.length){
            if (first[iFirst] < second[iSecond]){
                values[j] = first[iFirst];
                iFirst++;
            } else {
                values[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }

        while (iFirst < first.length){
            values[j] = first[iFirst];
            iFirst++;
            j++;
        }

        while (iSecond < second.length){
            values[j] = second[iSecond];
            iSecond++;
            j++;
        }
    }
}
