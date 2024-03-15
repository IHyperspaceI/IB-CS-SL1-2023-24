package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter10.events;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class DrawRectangleFrame extends JFrame {
    private DrawRectangleComponent component;

    class MyKeyListener implements java.awt.event.KeyListener {
        @Override
        public void keyPressed(KeyEvent e) {
            var key = KeyStroke.getKeyStrokeForEvent(e).toString();
            System.out.println("Pressed: " + key);
        }

        @Override
        public void keyTyped(KeyEvent e) {}
        @Override
        public void keyReleased(KeyEvent e) {}
    }
    class MousePressedListener implements MouseListener {
        @Override
        public void mousePressed(MouseEvent e) {
            component.moveTo(e.getX() - 12, e.getY() - 12);
        }

        @Override
        public void mouseClicked(MouseEvent e) {

        }
        @Override
        public void mouseReleased(MouseEvent e) {

        }
        @Override
        public void mouseEntered(MouseEvent e) {

        }
        @Override
        public void mouseExited(MouseEvent e) {

        }
    }

    public DrawRectangleFrame() {
        component = new DrawRectangleComponent();
        add(component);

        var listener = new MousePressedListener();
        var keyListener = new MyKeyListener();
        component.addMouseListener(listener);
        component.addKeyListener(keyListener);

        component.setFocusable(true);
        component.requestFocus();

        setSize(500, 500);
    }
}
