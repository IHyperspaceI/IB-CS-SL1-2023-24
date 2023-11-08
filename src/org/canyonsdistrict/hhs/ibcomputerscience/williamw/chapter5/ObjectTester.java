package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter5;

import java.awt.*;

public class ObjectTester {
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5,5,5,5);
        Rectangle box2 = box;
        Rectangle box3 = new Rectangle(5,5,5,5);

        if(box == box2){
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }

        if(box.equals(box3)){
            System.out.println("Same");
        } else {
            System.out.println("Not same");
        }
    }
}
