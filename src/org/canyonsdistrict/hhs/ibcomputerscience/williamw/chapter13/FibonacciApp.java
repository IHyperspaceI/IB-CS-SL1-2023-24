package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter13;

public class FibonacciApp {
    public static void main(String[] args) {
        System.out.println("- Loop -");
        var start = System.currentTimeMillis();
        System.out.println("Value: " + Fibonacci.fibLoop(75));
        System.out.println("Time: " + (double) (System.currentTimeMillis() - start) / 1000 + "s");


        System.out.println("- Recursion -");
        start = System.currentTimeMillis();
        System.out.println("Value: " + Fibonacci.fib(75));
        System.out.println("Time: " + (double) (System.currentTimeMillis() - start) / 1000 + "s");
    }
}
