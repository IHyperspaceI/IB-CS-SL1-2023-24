package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter6;

public class NestedLoopApp {
    public static void main(String[] args) {
        final int MAX = 10;
        final int MIN = 0;

        for (int index = 1; index <= MAX; index++){
            for (int jndex = 1; jndex <= MAX; jndex++){
                System.out.printf(" |%6d", index * jndex);
            }
            for (int jndex = MAX; jndex >= MIN; jndex--){
                System.out.printf(" |%6d", index * jndex);
            }
            System.out.println();
        }
        for (int index = MAX; index >= MIN; index--){
            for (int jndex = 1; jndex <= MAX; jndex++){
                System.out.printf(" |%6d", index * jndex);
            }
            for (int jndex = MAX; jndex >= MIN; jndex--){
                System.out.printf(" |%6d", index * jndex);
            }
            System.out.println();
        }
    }
}