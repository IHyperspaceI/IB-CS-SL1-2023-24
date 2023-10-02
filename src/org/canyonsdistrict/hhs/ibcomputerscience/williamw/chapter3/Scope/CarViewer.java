package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter3.Scope;

import javax.swing.*;

public class CarViewer {
    public static void main(String[] args) {
        var frame = new JFrame("cars lol");
        frame.setSize(300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        var carComponent = new CarComponent();
        frame.add(carComponent);

        frame.setVisible(true);
    }
}
