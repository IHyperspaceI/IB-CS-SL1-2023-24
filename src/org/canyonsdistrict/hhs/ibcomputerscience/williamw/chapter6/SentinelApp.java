package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter6;

import java.util.Scanner;

public class SentinelApp {
    public static void main(String[] args) {
        double salary = 0;
        double sum = 0;
        int count = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter salaries or -1 to quit");

        while (salary != -1){
            salary = in.nextDouble();
            if (salary == -1) {
                break;
            }
            sum += salary;
            count++;
        }

        if (count > 0){
            double average = sum / count;
            System.out.println("Average salary: " + average);
        } else {
            System.out.println("You didn't enter anything!");
        }
    }
}