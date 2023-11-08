package org.canyonsdistrict.hhs.ibcomputerscience.williamw.chapter5;

public class TaxReturn {
    public static final int SINGLE = 1;
    public static final int MARRIED = 2;

    public static final double RATE1 = 0.1;
    public static final double RATE2 = 0.25;

    public static final double RATE1_SINGLE_LIMIT = 32_000;
    public static final double RATE1_MARRIED_LIMIT = 64_000;

    private double income;
    private int maritalStatus;

    public TaxReturn(double income, int maritalStatus) {
        this.income = income;
        this.maritalStatus = maritalStatus;
    }

    public double getTax(){
        double tax1 = 0;
        double tax2 = 0;

        if (maritalStatus == SINGLE){
            if (income <= RATE1_SINGLE_LIMIT){
                tax1 = RATE1 * income;
            } else {
                tax1 = RATE1 * RATE1_SINGLE_LIMIT;
                tax2 = RATE2 * (income - RATE1_SINGLE_LIMIT);
            }
        } else {
            if (income <= RATE1_MARRIED_LIMIT){
                tax1 = RATE1 * income;
            } else {
                tax1 = RATE1 * RATE1_MARRIED_LIMIT;
                tax2 = RATE2 * (income - RATE1_MARRIED_LIMIT);
            }
        }

        return tax1 + tax2;
    }
}
