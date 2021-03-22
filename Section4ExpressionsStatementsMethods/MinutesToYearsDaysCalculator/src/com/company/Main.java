package com.company;

public class Main {
    private static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {
        // MinutesToYearsDaysCalculator
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }
    public static void printYearsAndDays(long minutes){
        if (minutes < 0) {
            System.out.println(INVALID_VALUE);
            return;
        }
        long years = minutes / (365 * 24 * 60);
        long days = (minutes % (365 * 24 * 60)) / (24*60);
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
        return;
    }
}
