package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter3.Scope;
import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

public class Car {
    private int x;
    private int y;

    public Car(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void draw(Graphics2D g2D){
        var body = new Rectangle(x, y + 10, 60, 10);
        var frontTire = new Ellipse2D.Double(x + 10, y + 20, 10, 10);
        var rearTire = new Ellipse2D.Double(x + 40, y + 20, 10, 10);
        var frontWindshield = new Line2D.Double(x + 10, y + 10, x + 20, y);
        var roof = new Line2D.Double(x + 20, y, x + 40, y);
        var rearWindshield = new Line2D.Double(x + 50, y + 10, x + 40, y);

        g2D.draw(body);
        g2D.draw(frontTire);
        g2D.draw(rearTire);
        g2D.draw(frontWindshield);
        g2D.draw(rearWindshield);
        g2D.draw(roof);
    }
}
