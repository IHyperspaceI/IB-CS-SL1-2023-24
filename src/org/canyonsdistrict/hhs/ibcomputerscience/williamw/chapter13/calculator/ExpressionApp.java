package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter13.calculator;

import java.util.Scanner;

public class ExpressionApp {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        System.out.println("Enter a mathematical expression (no exponents):");

        var input = in.nextLine();
        var evaluator = new Evaluator(input);
        System.out.printf("Result is %d", evaluator.getExpressionValue());
    }
}
