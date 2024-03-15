package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter13;

import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<String> permutate(String text) {
        List<String> result = new ArrayList<>();

        // Adding an empty string to catch permutations
        if (text.isEmpty()) {
            result.add(text);
            return result;
        }

        // For the given string, loop through each character
        for (int i = 0; i < text.length(); i++) {
            var shorterWord = text.substring(0, i) + text.substring(i + 1);
            var shorterPermutations = permutate(shorterWord);

            for (var s : shorterPermutations) {
                result.add(text.charAt(i) + s);
            }
        }
        return result;
    }
}
