package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter5;

import java.util.Scanner;

public class Shipping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the country you are shipping to:");
        var country = scanner.nextLine();
        var state = "";

        if (country.equalsIgnoreCase("USA")){
            System.out.println("What state:");
            state = scanner.nextLine();
        }

        if (!country.endsWith("USA") ||
                state.equalsIgnoreCase("HI") ||
                state.equalsIgnoreCase("AK")
        ) {
            System.out.println(20);
        } else {
            System.out.println(5);
        }



        // DEMorgan's Law
        if (!(country.equals("USA") &&
                !state.equalsIgnoreCase("AK") &&
                !state.equalsIgnoreCase("HI"))){

        }
    }
}
