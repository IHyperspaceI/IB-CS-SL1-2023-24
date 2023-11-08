package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter4;

public class PrimitiveTypesTester {
    public static void main(String[] args) {
        int n = 1_000_000;
        double dn1 = 3.35;
        double dn2 = 4.35;

        double doubleMil = n;
        long intMil = n;

        final int PENNY = 1;
        final int NICKLE = 5;
        final int DIME = 10;
        final int QUARTER = 25;

        long nn = n; // Implicit cast
        int n3 = (int)nn; //Explicit cast | DANGEROUS: can cause overflow errors
        double dd = nn; // Implicit cast
        long ll = (long)dd; // Explicit cast | DANGEROUS: will throw away any decimals

        System.out.println(7.0 / 4.0);
        System.out.println(7 / 4.0);
        System.out.println(7.0 / 4);
        System.out.println(7 / 4);
        System.out.println(7 % 4);

        System.out.println(Math.pow(7, 4));

        int val1 = 10;
        int val2 = 20;
        int val3 = 20;

        double average = (double) (val1 + val2 + val3) / 3;
        System.out.println(average);
    }
}
