package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter2.GUIApplications;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class ShapeComponent extends JComponent {
    /**
     * Use SetColor to change the paintbrush color. Everything drawn after this statement will
     *  be the color set.
     *
     * Instantiate a Color to create a custom color
     *  e.g. Color myColor = new Color(int r, int g, int b);
     *
     * Rectangles:
     *  Instantiate a rectangle with x, y, width, height
     *  e.g. Rectangle box = new Rectangle(xPos, yPos ,width, height);
     *
     *
     * Ellipses:
     *  Instantiate an ellipse with x, y, width, height
     *  e.g. Ellipse2D.Double circle = new Ellipse2D.Double(xPos, yPos ,width, height);
     *
     * Text:
     *  Set the Graphics2D font with:
     *  Graphics2D.setFont(new Font("fontName", Font.BOLD, size));
     *
     *  Draw text:
     *  Graphics2D.drawString("text", xPos, yPos);
     *
     * Graphics2D.fill fills a shape
     * Graphics2D.draw displays a shape
     *
     * @param g the <code>Graphics</code> object to protect
     */
    public void paintComponent(Graphics g){
        Graphics2D g2D = (Graphics2D) g; // Casting - changing a type to another type

        //Rectangle:
        Rectangle box = new Rectangle(10, 10,50, 50);
        g2D.setColor(Color.DARK_GRAY); // Set paintbrush color
        g2D.fill(box);

        g2D.draw(box); //Draw it once

        box.translate(10,10);
        g2D.setColor(Color.LIGHT_GRAY); // Set paintbrush color
        g2D.fill(box);

        g2D.draw(box); // Draw another after translating



        //Ellipse:
        Ellipse2D.Double circle = new Ellipse2D.Double(70, 70, 100, 100);
        g2D.setColor(Color.DARK_GRAY); // Set paintbrush color
        g2D.fill(circle);

        g2D.draw(circle); //Draw it once

        circle.x = 80;
        circle.y = 80;
        g2D.setColor(Color.LIGHT_GRAY); // Set paintbrush color
        g2D.fill(circle);
        g2D.draw(circle); // Draw another after translating



        //Line:
        Line2D.Double line = new Line2D.Double(200, 200, 300, 300);
        g2D.draw(line);

        line.x1 = 200;
        line.y1 = 250;
        line.x2 = 300;
        line.y2 = 350;

        g2D.draw(line);


        // Use text:
        g2D.setFont(new Font("Exo", Font.BOLD, 40));
        g2D.drawString("Hello, World!", 10, 400);
    }
}