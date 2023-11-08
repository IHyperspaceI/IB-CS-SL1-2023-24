package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter4;

import java.util.Scanner;

public class IOTester {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        //newMethod(scanner);

        var name = "Will";
        var firstLetter = name.substring(0, 1);
        var theRest = name.substring(1);

        System.out.printf("The first letter is \"%s\"\n", firstLetter);
        System.out.printf("The rest of the string is \"%s\"", theRest);
    }

    private static void newMethod(Scanner scanner) {
        System.out.println("This is a calculator that adds two numbers");
        System.out.println("Enter your first number:");
        var firstNumber = scanner.nextDouble();
        System.out.println("Enter your second number:");
        var secondNumber = scanner.nextDouble();

        double answer = firstNumber + secondNumber;

        System.out.printf("%f + %f = %8s\n", firstNumber, secondNumber, answer);

        scanner.nextLine();

        System.out.print("Enter your name: ");
        var name = scanner.nextLine();
        System.out.printf("Hi, %s!", name);
    }
}
