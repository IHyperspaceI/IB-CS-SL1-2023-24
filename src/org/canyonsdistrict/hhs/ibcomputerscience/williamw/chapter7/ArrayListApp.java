package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter7;

import org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter6.investment.InvestmentApp;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp {
    public static void main(String[] args) {
        //arrayListStuff();

        var values = List.of(55, 76, 132, 8, 32, 8, 5432, 754, 5, 425, 7);
        System.out.println("List: " + values);
        System.out.printf("Largest int: %d\n", findLargest(values));
        System.out.printf("Smallest int: %d\n", findSmallest(values));

        var values2 = new ArrayList<Integer>(values);
        remove(values2, 50);

        System.out.println("Modded list: " + values2);
    }

    private static void remove(List<Integer> values, int check){
        int i = 0;
        while (i < values.size()) {
            if (values.get(i) < check){
                values.remove(i);
            } else {
                i++;
            }
        }
    }

    private static int findLargest(List<Integer> values){
        int largest = values.get(0);
        for (int i = 1; i < values.size(); i++){
            if (values.get(i) > largest){
                largest = values.get(i);
            }
        }
        return largest;
    }

    private static int findSmallest(List<Integer> values){
        int smallest = values.get(0);
        for (var value : values) {
            if (value < smallest){
                smallest = value;
            }
        }
        return smallest;
    }

    private static void arrayListStuff() {
        List<String> foods = new ArrayList<>();
        //ArrayList<String> foods = new ArrayList<String>(); - not the greatest method


        foods.add("Kiwi");
        foods.add("Pizza");
        foods.add("Passion fruit");
        foods.add("Sushi");

        System.out.println(foods);

        foods.set(1, "Steak");

        System.out.println(foods);

        foods.add(0, "English Muffin");

        System.out.println(foods);

        foods.remove(3);
        foods.remove("English Muffin");
        foods.add("Beagle");

        System.out.println(foods);
        System.out.printf("There are %d items\n", foods.size());

        for (var food : foods) {
            System.out.printf("You like: %s!\n", food);
        }

        var newFoods = new ArrayList<>(foods); //Copying an ArrayList

        List<Integer> values = new ArrayList<>();
        values.add(1);
        //Autoboxing - changing a primitive type to a wrapper type automagically

        /*
        PT      WC
        byte    Byte
        boolean Boolean
        char    Character
        double  Double
        float   Float
        int     Integer
        long    Long
        short   Short
         */
    }
}
