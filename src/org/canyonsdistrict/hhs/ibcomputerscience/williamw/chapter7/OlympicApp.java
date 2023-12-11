package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter7;

public class OlympicApp {
    public static void main(String[] args) {
        final int COUNTRIES = 5;
        final int MEDALS = 3;
        int[][] medalCounts = new int[COUNTRIES][MEDALS]; //Initialize 2D array to 0-filled 5x3

        int[][] counts = {
                {0, 3, 2}, //Gold, silver, bronze
                {2, 3, 1},
                {3, 0, 2},
                {0, 0, 1},
                {5, 4, 9}
        };

        var totalGold = 0;
        for (int i = 0; i < counts.length; i++){
            totalGold += counts[i][0];
        }

        System.out.println("Total Gold: " + totalGold);


        var totalMedals = 0;
        System.out.println("Medals: ");

        for (int i = 0; i < counts.length; i++){ //Visits each row
            for (int j = 0; j < counts[i].length; j++){
                totalMedals += counts[i][j];
                System.out.printf("%8d", counts[i][j]);
            }
            System.out.println();
        }
        System.out.println("Total: " + totalMedals);
    }
}
