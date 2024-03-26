package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter15;

import java.util.HashSet;

public class SetApp {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        names.add("Veeranshu");
        names.add("Veeranshu");
        names.add("Sidharth");
        names.remove("Veeranshu");

        if (names.contains("Sidharth")) {
            System.out.println("Lol");
        }

        for (var name : names) {
            System.out.println(name);
        }
    }
}
