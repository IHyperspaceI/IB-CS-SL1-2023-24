package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter5;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter floor between 1 and 20:");

        if (scanner.hasNextInt()){
            int floor = scanner.nextInt();
            if (floor == 13){
                System.out.println("Error: 13 is not real!");
            } else if(floor <= 0 || floor > 20){
                System.out.println("Error: Floor must be between 1 and 20!");
            } else {
                int actualFloor = floor > 13
                        ? floor - 1
                        : floor;
                System.out.println("Going to floor " + actualFloor);
            }
        } else {
            System.out.println("Error: " + scanner.nextLine() + " is not an integer!");
        }
    }
}
