package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter13.eightqueens;

public class EightQueensApp {
    private static int solutions = 0;
    public static void main(String[] args) {
        solve(new PartialSolution(0));

    }
    public static void solve(PartialSolution solution) {
        int test = solution.test();

        if (test == PartialSolution.ACCEPT) {
            System.out.println("" + solutions + ": " + solution);
            solutions++;
        } else if (test == PartialSolution.CONTINUE) {
            for (var partial : solution.extendSolution()) {
                solve(partial);
            }
        }
    }
}
