package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter2.GUIApplications;

import javax.swing.*;
import java.awt.*;

public class RectangleViewer {
    public static void main(String[] args) {
        ShapeComponent shapeComponent = new ShapeComponent();


        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        frame.setTitle("Hello, World!");
        frame.setBackground(Color.DARK_GRAY);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes the app and stops the code

        frame.add(shapeComponent);

        frame.setVisible(true); // Do this after everything is added
    }
}
