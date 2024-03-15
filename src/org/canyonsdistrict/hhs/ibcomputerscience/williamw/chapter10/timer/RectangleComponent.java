package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter10.timer;

import javax.swing.*;
import java.awt.*;

public class RectangleComponent extends JComponent {
    private Rectangle box;

    public RectangleComponent() {
        box = new Rectangle(500, 500, 100, 100);
    }
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.draw(box);
    }

    public void move(int deltaX, int deltaY) {
        box.translate(deltaX, deltaY);
        repaint();
    }
}
