package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter10.interfaces;

public class Country implements Measurable {
    private double population;

    public Country (double population) {
        this.population = population;
    }


    @Override
    public double getMeasure() {
        return population;
    }
}
