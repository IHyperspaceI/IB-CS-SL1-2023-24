package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter6;

public class AlgorithmApp {
    public static void main(String[] args) {
        String river = "Mississippi";
        boolean found = false;
        int position = 0;

        while (position < river.length() && !found){
            if (river.charAt(position) == 'i'){
                found = true;
            } else {
                position ++;
            }
        }

        System.out.printf("The first i is found at %s", position);
    }

    private static void getNumIsWhile(String river, int numIs) {
        char charToLookFor = 'i';
        int position = -1;
        int index = 0;

        while (position != -1 && index < river.length()){
            char ch = river.charAt(index);

            if (ch == 'i' || ch == 'I'){
                numIs++;
            }
        }
    }

    private static int getNumIsFor(String river, int numIs) {
        for (int index = 0; index < river.length(); index++){
            char ch = river.charAt(index);

            if (ch == 'i' || ch == 'I'){
                numIs++;
            }
        }
        System.out.printf("There are %d i's in %s", numIs, river);
        return numIs;
    }
}
