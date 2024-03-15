package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter10.interfaces;

public interface Measurable {
    double getMeasure();

    static double average(Measurable[] objects) {
        double sum = 0;

        for (Measurable object : objects) {
            sum += object.getMeasure();
        }

        if (objects.length > 0) {
            return sum / objects.length;
        } else {
            return 0;
        }
    }

    default String getDescription() {
        return "Haiii :)";
    }
}
