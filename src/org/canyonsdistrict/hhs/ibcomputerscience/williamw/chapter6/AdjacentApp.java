package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter6;

import java.util.Scanner;

public class AdjacentApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        while (scanner.hasNextInt()){
            int previous = input;
            input = scanner.nextInt();

            if (previous == input){
                System.out.println("Duplicate!");
            }
        }
    }
}
