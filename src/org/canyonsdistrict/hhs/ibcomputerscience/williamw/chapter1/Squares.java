package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter1;

public class Squares {
    public final String SQUAREACHTER = "#";

    public void PrintSquares(int rows, int columns){
        for (int currentRow = 0; currentRow < rows; currentRow++){
            if (currentRow == 0 || currentRow == rows){
                System.out.print(SQUAREACHTER);
            }else if (currentRow > 2 && currentRow < rows - 2){
                for (int currentColumn = 0; currentColumn < columns; currentColumn++){
                    System.out.print(SQUAREACHTER);
                }
            }else {
                System.out.print(SQUAREACHTER);
            }

            System.out.println("\n");
        }
    }
}
