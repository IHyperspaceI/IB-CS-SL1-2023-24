package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter13;

import static org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter13.Permutation.permutate;

public class PermutateApp {
    public static void main(String[] args) {
        String word = "ckuf";
        var values = permutate(word);
        for (var s : values) {
            System.out.println(s);
        }
    }
}
