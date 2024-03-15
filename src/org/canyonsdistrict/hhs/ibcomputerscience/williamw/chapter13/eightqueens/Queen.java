package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter13.eightqueens;

public class Queen {
    private int row;
    private int column;

    public Queen(int row, int column) {
        this.row = row;
        this.column = column;
    }

    public boolean attack(Queen queen) {
        return row == queen.row
                || column == queen.column
                || Math.abs(row - queen.row) == Math.abs(column - queen.column);
    }

    public String toString() {
        return "" + "ABCDEFGHIJKLMNOPQRSTUVWXYZ".charAt(column) + (row + 1);
    }
}
