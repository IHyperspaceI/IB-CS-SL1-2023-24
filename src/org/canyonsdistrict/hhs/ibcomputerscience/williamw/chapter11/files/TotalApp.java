package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter11.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TotalApp {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Input file: ");
        String inputFileName = console.nextLine();

        System.out.println("Output file: ");
        String outputFileName = console.nextLine();

        File inputFile = new File(inputFileName);
        File outputFile = new File(outputFileName);

        try (Scanner in = new Scanner(inputFile); PrintWriter out = new PrintWriter(outputFileName)){
            double total = 0;

            while (in.hasNextDouble()) {
                var value = in.nextDouble();
                out.printf("%10.2f\n", value);
                total += value;
            }

            out.printf("Total: %10.2f", total);
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file " + e.getMessage());
        }
    }
}
