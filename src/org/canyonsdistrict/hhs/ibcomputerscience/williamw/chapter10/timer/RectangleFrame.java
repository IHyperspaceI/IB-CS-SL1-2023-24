package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter10.timer;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.util.Random;

public class RectangleFrame extends JFrame {
    private RectangleComponent component;

    class TimerListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            Random random = new Random();

            component.move(random.nextInt(-2, 2), random.nextInt(-2, 2));
        }
    }

    public RectangleFrame() {
        for (int i = 0; i < 5; i++) {
            component = new RectangleComponent();
            add(component);
        }

        setSize(1000, 1000);

        var listener = new TimerListener();
        final int DELAY = 50; //in ms
        var timer = new Timer(DELAY, listener);
        timer.start();
    }
}
