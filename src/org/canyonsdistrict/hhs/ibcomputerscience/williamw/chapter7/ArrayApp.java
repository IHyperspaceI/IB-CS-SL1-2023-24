package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter7;

public class ArrayApp {
    public static void main(String[] args) {
        int[] grades = new int[100];
        int[] grades2 = {5, 5, 5};

        int[] grades3 = grades2;

        int count = getGrades(grades2);
        printArray(grades2, count);

        //Only use with fully filled arrays and those that aren't going to be changed
        int sum = 0;
        for (var grade : grades2){
            sum += grade;
        }
    }

    private static int getGrades(int[] grades){
        return grades.length;
    }

    private static void printArray(int[] grades, int count){
        for (int index = 0; index < count; index++){
            System.out.println(grades[index]);
        }
    }
}
