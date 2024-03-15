package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter14;

public class StopWatch {
    private long startTime;
    private long elapsedTime;
    private boolean isRunning;

    public void start() {
        if (isRunning) {
            return;
        }

        isRunning = true;
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        if (!isRunning) {
            return;
        }

        isRunning = false;
        var endTime = System.currentTimeMillis();
        elapsedTime = elapsedTime + endTime - startTime;
    }

    public void reset() {
        elapsedTime = 0;
        startTime = 0;
        isRunning = false;
    }

    public long getElapsedTime() {
        if (isRunning) {
            var endTime = System.currentTimeMillis();
            return elapsedTime + endTime - startTime;
        }
        return elapsedTime;
    }
}
