package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter13;

public class Fibonacci {
    public static long fib(int n) {
        if (n <= 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static long fibLoop(int n) {
        if (n <= 1) {
            return 1;
        }

        long firstValue = 0;
        long secondValue = 1;
        long value = 0;

        for (int i = 1; i <= n; i++) {
            value = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = value;

            //System.out.println(value);
        }
        return value;
    }

    private static long calcFib(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n - 1 + n - 2;
        }
    }
}
