package com.company;

public class Main {

    public static void main(String[] args) {
        // CodingExercise13NumberOfDaysInMonth
        System.out.println("isLeapYear(-1600) = " + isLeapYear(-1600));
        System.out.println("isLeapYear(1600) = " + isLeapYear(1600));
        System.out.println("isLeapYear(2017) = " + isLeapYear(2017));
        System.out.println("isLeapYear(2000) = " + isLeapYear(2000));
        System.out.println("----");
        System.out.println("getDaysInMonth(1, 2020) = " + getDaysInMonth(1, 2020));
        System.out.println("getDaysInMonth(2, 2020) = " + getDaysInMonth(2, 2020));
        System.out.println("getDaysInMonth(2, 2018) = " + getDaysInMonth(2, 2018));
        System.out.println("getDaysInMonth(-1, 2020) = " + getDaysInMonth(-1, 2020));
        System.out.println("getDaysInMonth(1, -2020) = " + getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999) return false;
        return (year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0;
    }

    public static int getDaysInMonth(int month, int year){
        if (year < 1 || year > 9999) return -1;
        switch (month) {
            case 1: // JAN
            case 3: // MAR
            case 5: // MAY
            case 7: // JUL
            case 8: // AUG
            case 10: // OCT
            case 12: // DEC
                return 31;
            case 4: // APR
            case 6: // JUN
            case 9: // SEP
            case 11: // NOV
                return 30;
            case 2: // FEB
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }
}
