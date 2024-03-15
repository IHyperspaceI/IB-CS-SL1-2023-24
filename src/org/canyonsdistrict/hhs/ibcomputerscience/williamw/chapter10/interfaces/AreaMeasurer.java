package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter10.interfaces;

import java.awt.*;

public class AreaMeasurer implements Measurer {
    public double measure(Object obj) {
        Rectangle rect = (Rectangle) obj;

        return rect.height * rect.width;
    }
}
