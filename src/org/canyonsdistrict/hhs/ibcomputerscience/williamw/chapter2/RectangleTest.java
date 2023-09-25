package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class RectangleTest {
    @Test
    public void testTranslate(){
        Rectangle box = new Rectangle();
        Assertions.assertEquals(0, box.height);
    }
}
