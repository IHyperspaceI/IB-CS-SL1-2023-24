package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter13;

public class Triangle {
    private int width;

    public Triangle(int width) {
        this.width = width;
    }

    public int getArea() {
        // Terminating condition
        if (width <= 0) {
            return 1;
        }

        var smallerTriangle = new Triangle(width - 1);
        // Recursive call
        int smallerArea = smallerTriangle.getArea();
        return smallerArea + width;
    }
}
