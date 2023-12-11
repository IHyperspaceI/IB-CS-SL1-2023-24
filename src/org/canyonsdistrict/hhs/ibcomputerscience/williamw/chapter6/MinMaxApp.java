package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter6;

import java.util.Scanner;

public class MinMaxApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer or any other value to quit");
        int largest;

        if (!scanner.hasNextInt()){
            System.out.println("You quit already???");
            return; //returns out of method
        }

        largest = scanner.nextInt();
        while (scanner.hasNextInt()){
            int value = scanner.nextInt();

            if (value > largest){
                largest = value;
            }
        }

        System.out.printf("The largest value is %d", largest);
    }
}
