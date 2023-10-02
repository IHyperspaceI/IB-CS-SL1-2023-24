package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter3.Scope;

import javax.swing.*;
import java.awt.*;

public class CarComponent extends JComponent {
    public void paintComponent(Graphics g){
        Graphics2D g2D = (Graphics2D) g;

        var car1 = new Car(0, 0);
        int x = getWidth() - 60;
        int y = getHeight() - 30;
        var car2 = new Car(x, y);

        car1.draw(g2D);
        car2.draw(g2D);
    }
}
