package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter13;

public class TriangleApp {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(10000);
        var area = triangle.getArea();
        System.out.println(area);
    }
}
