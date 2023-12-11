package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter7;

import java.util.Random;

public class AlgorithmApp {
    static Random random = new Random();
    
    public static void main(String[] args) {
        int[] values = new int[5];
        fillArray(values);

        for (var value : values) {
            System.out.println(value);
        }

        int sum = getSum(values);
        System.out.printf("Sum: %d", sum);

        if (values.length > 0){
            System.out.printf("\nAverage: %d", sum / values.length);
        }

        System.out.printf("\nMin: %d", getMin(values));
        System.out.printf("\nMax: %d\n", getMax(values));

        printArrayWithSeparators(values, '|');

        System.out.printf("\nThe position of %d is %d\n", 69, getPosition(values, 69));

        var count = removeItem(values, 3, values.length);
        printArray(values, count);
        //count = removeItem(values, 4, count);
        //printArray(values, count);

        count = insertAtEnd(values, 80085, count);
        printArray(values, count);

        count = removeItem(values, 4, values.length);
        printArray(values, count);

        count = insert(values, 808, 0, count);
        printArray(values, count);

        swap(values, 4, 0);
        printArray(values, count);

        int[] valuesCopy = new int[values.length];
        int size = copyArray(values, valuesCopy, values.length);
        printArray(valuesCopy, valuesCopy.length);
    }

    private static int copyArray(int[] source, int[] destination, int size){
        for (int index = 0; index < size; index++){
            destination[index] = source[index];
        }
        return size;
    }

    private static void fillArray(int[] array){
        for (int index = 0; index < array.length; index++){
            array[index] = random.nextInt(256);
        }
    }

    private static void swap(int[] values, int first, int second){
        var temp = values[first];
        values[first] = values[second];
        values[second] = temp;
    }


    private static int insert(int[] values, int element, int position, int currentSize){
        if (currentSize < values.length){
            currentSize++;
            for (int index = currentSize - 1; index > position; index--){
                values[index] = values[index - 1];
            }
            values[position] = element;
        }
        return currentSize;
    }

    private static int insertAtEnd(int[] values, int element, int currentSize){
        if (currentSize < values.length){
            values[currentSize] = element;
            ++currentSize;
        }
        return currentSize;
    }

    private static int getSum(int[] array){
        int sum = 0;

        for (var value : array) {
            sum += value;
        }
        return sum;
    }

    private static int getMin(int[] array){
        int min = array[0];

        for (var value : array) {
            if (value < min){
                min = value;
            }
        }
        return min;
    }

    private static int getMax(int[] array){
        int max = array[0];

        for (var value : array) {
            if (value > max){
                max = value;
            }
        }
        return max;
    }

    private static void printArray(int[] array, int count){
        for (int index = 0; index < count; index++){
            System.out.printf("%d, ", array[index]);
        }
        System.out.println();
    }

    private static void printArrayWithSeparators(int[] array, char character){
        for (int index = 0; index < array.length; index++) {
            if (index > 0){
                System.out.print(character);
            }
            System.out.print(array[index]);
        }
        System.out.println();
    }


    private static int getPosition(int[] array, int value){
        int position = 0;
        boolean found = false;

        while (position < array.length && !found){
            if (array[position] == value){
                found = true;
            } else {
                position++;
            }
        }

        return found
                ? position
                : -1;
    }

    private static int removeItem(int[] array, int position, int count){
        for (int index = position + 1; index < count; index++){
            array[index - 1] = array[index];
        }
        return --count;
    }
}
