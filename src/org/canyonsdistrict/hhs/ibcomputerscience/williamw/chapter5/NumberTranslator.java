package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter5;

import java.util.Enumeration;
import java.util.Scanner;

public class NumberTranslator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Numbers numbers = Numbers.valueOf("ONE");
        System.out.println("Enter a number between 0 and 9");
        int inputNum = scanner.nextInt();

        switch (inputNum){
            case 1 :
                System.out.println(Numbers.ONE);
                break;
            case 2 :
                System.out.println(Numbers.TWO);
                break;
            case 3:
                System.out.println(Numbers.THREE);
                break;
            case 4:
                System.out.println(Numbers.FOUR);
                break;
            case 5:
                System.out.println(Numbers.FIVE);
                break;
            case 6:
                System.out.println(Numbers.SIX);
                break;
            case 7:
                System.out.println(Numbers.SEVEN);
                break;
            case 8:
                System.out.println(Numbers.EIGHT);
                break;
            case 9:
                System.out.println(Numbers.NINE);
                break;
            default :
                System.out.println("Not mapped yet");
        }
    }
}
