package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter5;

import java.util.Scanner;

public class EarthquakeTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the richter score: ");
        double richter = scanner.nextDouble();

        if(richter >= 8){
            System.out.println("Most structures fall");
        } else if (richter >= 7) {
            System.out.println("Many buildings destroyed");
        } else if (richter >= 6) {
            System.out.println("Many buildings are damaged, some collapse");
        } else if (richter >= 4.5) {
            System.out.println("Damage to poorly constructed buildings");
        } else {
            System.out.println("No damage to buildings");
        }
    }
}
