package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter11.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HumanCounterApp {
    public static void main(String[] args) throws FileNotFoundException {
        var inputFile = new File("Files/Countries.txt");
        Scanner scanner;

        try {
            scanner = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("Files/Countries.txt was not found");
            return;
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            //System.out.println(line);

            /*
            int i = 0;
            while (!Character.isDigit(line.charAt(i))) {
                i++;
            }

            var countryName = line.substring(0, i);
            var population = line.substring(i);
             */

            Scanner lineIn = new Scanner(line);
            String countryName = lineIn.next();

            while (!lineIn.hasNextInt()) {
                countryName = countryName + " " + lineIn.next();
            }

            int population = lineIn.nextInt();

            System.out.printf("Country: %15s | Population: %-12s\n", countryName, population);
        }
    }
}