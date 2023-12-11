package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter6;

import java.util.Scanner;

public class PromptApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int guess;
        do {
            System.out.print("Enter a value between 1 and 100 inclusive: ");
            guess = scanner.nextInt();
        } while (guess < 1 || guess > 100);


        boolean valid = false;
        guess = 0;
        while (!valid){
            System.out.print("Enter a value between 1 and 100 inclusive: ");
            guess = scanner.nextInt();

            if (guess >= 1 && guess <= 100){
                valid = true;
            } else {
                System.out.println("Bad value!");
            }
        }
    }
}
