package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter15;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.addFirst("Alex");
        names.addFirst("Om");
        names.add("Erika");
        names.add("Will");
        names.addFirst("Marla");
        //names.removeFirst();
        //names.removeLast();
        names.add("Matus");
        names.add("Kushal");

        ListIterator<String> iterator = names.listIterator();
        while (iterator.hasNext()) {
            var name = iterator.next();

            if (name.equals("Om")) {
                iterator.remove();
                iterator.next();
                iterator.remove();
            }
            if (name.equals("Erika")) {
                iterator.add("Peter");
            }
        }

        for (var name : names) {
            System.out.println(name);
        }
    }
}
