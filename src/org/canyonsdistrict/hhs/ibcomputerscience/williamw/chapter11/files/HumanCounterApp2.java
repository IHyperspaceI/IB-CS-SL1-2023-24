package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter11.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class HumanCounterApp2 {
    public static void main(String[] args) throws FileNotFoundException {
        String inputFile = "";
        String outputFile = "";


        for (int i = 0; i < args.length; i++) {
            if (args[i].equals("-i")) {
                inputFile = args[i + 1];
                i++;
                continue;
            }
            if (args[i].equals("-o")) {
                outputFile = args[i + 1];
                i++;
                continue;
            }
            if (args[i].equals("-h")) {
                printHelpMenu();
                return;
            }
        }

        if (inputFile.isEmpty() || outputFile.isEmpty()) {
            printHelpMenu();
        }

        long totalPop = 0;
        int count = 0;
        var in = new Scanner(new File(inputFile));

        while (in.hasNextLine()) {
            var line = in.nextLine();
            var lineScanner = new Scanner(line);

            while (!lineScanner.hasNextLong()) {
                lineScanner.next();
            }

            totalPop += lineScanner.nextLong();
            count++;
        }

        long average = 0;
        if (count > 0) {
            average = totalPop / count;
        }

        var out = new PrintWriter(outputFile);
        out.printf("Average population: %d\nTotal population: %d", average, totalPop);
        out.close();
    }

    private static void printHelpMenu() {
        System.out.println("""
                -i input file
                -o output file
                -h show help menu
                """);
        return;
    }
}