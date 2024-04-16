package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter15;

import com.sun.jdi.InterfaceType;

import java.util.HashSet;
import java.util.Set;

public class SetApp {
    public static void main(String[] args) {
        Set<String> names = new HashSet<String>();
        names.add("Veeranshu");
        names.add("Veeranshu");
        names.add("Sidharth");
        names.remove("Veeranshu");

        for (var name : names){
            System.out.println(name);
        }
    }
}
