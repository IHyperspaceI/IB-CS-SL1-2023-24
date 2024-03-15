package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter10.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!!!!11!!!11!!1!");
    }
}
