package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter10.interfaces;

public class Book implements Measurable {
    private double pages;

    public Book (double pages) {
        this.pages = pages;
    }

    @Override
    public double getMeasure() {
        return pages;
    }
}
