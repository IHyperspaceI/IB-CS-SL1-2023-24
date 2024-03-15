package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter10.interfaces;

import java.awt.*;

public class AreaApp {
    static class LengthMeasurer implements Measurer {
        @Override
        public double measure(Object anObject) {
            var rect = (Rectangle)anObject;
            return rect.getWidth();
        }
    }
    public static void main(String[] args) {
        var areaMeasurer = new AreaMeasurer();

        Rectangle[] rectangles = new Rectangle[] {
                new Rectangle(0, 0, 50, 50),
                new Rectangle(0, 0, 100, 5),
                new Rectangle(0, 0, 200, 500),
        };

        double averageArea = Data.average(rectangles, areaMeasurer);

        String[] names = new String[] {
                "Bob",
                "Matus",
                "Maru",
                "Seth",
                "bill"
        };

        Measurer lengthMeasurer = (Object obj) -> ((String) obj).length();

        var newLengthMeasurer = new LengthMeasurer();
        var averageLength = Data.average(names, newLengthMeasurer);

        //Anonymous inner class
        var averageHeight = Data.average(rectangles, new Measurer() {
            @Override
            public double measure(Object anObject) {
                var rect = (Rectangle)anObject;
                return rect.getHeight();
            }
        });
    }
}
