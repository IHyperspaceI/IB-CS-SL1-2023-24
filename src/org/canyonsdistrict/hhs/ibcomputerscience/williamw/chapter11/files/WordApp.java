package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter11.files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordApp {
    public static void main(String[] args) throws FileNotFoundException {
        var inputFile = new File("Files/words.txt");
        var scanner = new Scanner(inputFile);

        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
