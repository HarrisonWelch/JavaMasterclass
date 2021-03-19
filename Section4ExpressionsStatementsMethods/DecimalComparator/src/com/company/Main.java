package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("DecimalComparator.areEqualbyThreeDecimalPlaces(-3.1756, -3.175) = " +
                DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println("DecimalComparator.areEqualbyThreeDecimalPlaces(-3.176, -3.175) = " +
                DecimalComparator.areEqualByThreeDecimalPlaces(-3.176, -3.175));
        System.out.println("DecimalComparator.areEqualbyThreeDecimalPlaces(3.0, 3.0) = " +
                DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println("DecimalComparator.areEqualbyThreeDecimalPlaces(-3.123, 3.123) = " +
                DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
