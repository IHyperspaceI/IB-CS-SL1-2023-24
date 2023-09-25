package org.canyonsdistrict.hhs.ibcomputerscience.chapter2;

import java.awt.*;
import java.io.File;
import java.math.BigInteger;
import java.nio.file.Path;

public class JavaAPIAssignment {
    public static void main(String[] args) {
        // String:
        // ASCII of 69 is E
        System.out.println("HELLO, WORLD!".indexOf(69)); // Overload 1, returns 1, because E is at index 1
        System.out.println("HELLO, WORLD!".indexOf(69, 5)); // Overload 2, returns -1, because E does not exist after index 5 (as specified in args)
        System.out.println("HELLO, WORLD!".indexOf(", W")); // Overload 3, returns 5, because ", W" first occurs at index 5
        System.out.println("HELLO, WORLD!".indexOf(", W", 4)); // Overload 4, returns 5, because ", W" first occurs at index 5, which is past index 4 where the search starts

        // List:
        List list = new List();
        list.add("Hello");
        list.add(", ");
        list.add("World!");

        // Print the starting version of the list:
        for (int index = 0; index < list.getItems().length; index++){
            System.out.println(list.getItem(index));
        }

        list.remove(1); // Removes ", " from the list


        // Print the version of the list after removing index 1:
        for (int index = 0; index < list.getItems().length; index++){
            System.out.println(list.getItem(index));
        }

        list.remove("Hello"); // Removes "Hello" from the list

        // Print the version of the list after removing "Hello":
        for (int index = 0; index < list.getItems().length; index++){
            System.out.println(list.getItem(index));
        }


        // BigInteger
        BigInteger gigaInt = new BigInteger("50000000000000");

        System.out.println(gigaInt.toString()); // Overload 1, prints "50000000000000"
        System.out.println(gigaInt.toString(16)); // Overload 1, prints 50000000000000 in hexadecimal form


        // Path
        File file = new File("/Users/hyperspace/Downloads/NewPath");
        Path path = file.toPath();

        System.out.println(path.startsWith("/Users")); // Prints true, because the path specified in the file instantiation starts with "/Users"
        System.out.println(path.startsWith(path)); // Prints true, because it is comparing its path with its path, which cannot be different

        // File
        File file1 = new File("/Users/hyperspace/Downloads/NewPath");
        System.out.println(file1.setExecutable(false)); // Prints true if the file exists and IntelliJ has access to the path, because the operation is successful. This makes the owner unable to execute the file
        System.out.println(file1.setExecutable(false, false)); // Prints true if the file exists and IntelliJ has access to the path, because the operation is successful. This makes everyone unable to execute the file
    }
}