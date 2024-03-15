package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter13.eightqueens;

import java.util.Arrays;

public class PartialSolution {
    private Queen[] queens;
    public static final int NUM_QUEENS = 16;
    public static final int ACCEPT = 1;
    public static final int REJECT = 2;
    public static final int CONTINUE = 3;

    public PartialSolution(int size) {
        queens = new Queen[size];
    }

    public int test() {
        for (int i = 0; i < queens.length; i++) {
            for (int j = i + 1; j < queens.length; j++) {
                if (queens[i].attack(queens[j])) {
                    return REJECT;
                }
            }
        }

        if (queens.length == NUM_QUEENS) {
            return ACCEPT;
        } else {
            return CONTINUE;
        }
    }

    public PartialSolution[] extendSolution() {
        var result = new PartialSolution[NUM_QUEENS];

        for (int i = 0; i < result.length; i++) {
            int size = queens.length;
            result[i] = new PartialSolution(size + 1);

            // Copy this solution to the new one
            for (int j = 0; j < size; j++) {
                result[i].queens[j] = queens[j];
            }
            result[i].queens[size] = new Queen(size, i);
        }
        return result;
    }

    public String toString() {
        return Arrays.toString(queens);
    }
}
