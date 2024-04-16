package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SpellChecker {

    public static void main(String[] args) throws FileNotFoundException{
        var dictionary = readWords("words");
        var document = readWords("test.txt");

        System.out.println("Misspelled words");

        for (var word : document){
            if (!dictionary.contains(word)){
                System.out.println(word);

            }
        }
    }

    private static Set<String> readWords(String filename) throws FileNotFoundException {
        var words = new HashSet<String>();
        var in = new Scanner(new File(filename));
        in.useDelimiter("[^a-zA-z]+");
        while (in.hasNext()){
            words.add(in.next().toLowerCase());

        }
        return words;
    }
}
