package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter10.events;

import javax.swing.*;
import java.awt.*;

public class DrawRectangleComponent extends JComponent {
    private Rectangle box;

    DrawRectangleComponent() {
        box = new Rectangle(50, 50, 25, 25);
    }

    @Override
    protected void paintComponent(Graphics g) {
        var g2d = (Graphics2D) g;
        g2d.draw(box);
    }


    public void moveTo(int x, int y) {
        box.setLocation(x, y);
        repaint();
    }
}
