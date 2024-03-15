package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.searching;

import org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.ArrayUtil;
import org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.Person;
import org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.searching.LinearSearcher;
import org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14.sorting.MergeSorter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class SearchApp {
    public static void main(String[] args) {
        var values = ArrayUtil.randomArray(1000000, 100000);
        Arrays.sort(values);
        var scanner = new Scanner(System.in);

        System.out.println(Arrays.toString(values));

        System.out.println("Enter value to search: ");
        var value = scanner.nextInt();
        int position = BinarySearcher.search(values, value);

        if (position == -1) {
            System.out.printf("%d was not found!", value);
        } else {
            System.out.printf("%d is in position %d", value, position);
        }

        Comparator<Person> nameCompare = (n1, n2) -> n1.getName().compareTo(n2.getName());

        Person[] people = new Person[100];
        Arrays.sort(people, nameCompare);
        System.out.println(people);
    }
}
