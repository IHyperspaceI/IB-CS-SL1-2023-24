package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter10.events;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.util.Random;

public class ButtonApp {
    public static void main(String[] args) {
        var frame = new JFrame();
        var button = new JButton("no balls");

        frame.add(button);
        frame.setSize(200, 200);

        button.addActionListener(
                (ActionEvent) -> System.out.println("lmao")
        );

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
