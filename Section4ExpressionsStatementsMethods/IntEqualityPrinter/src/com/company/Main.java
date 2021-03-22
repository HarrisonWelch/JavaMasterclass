package com.company;

public class Main {

    private static final String INVALID_VALUE = "Invalid Value";
    public static void main(String[] args) {
        // IntEqualityPrinter
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
    }

    public static void printEqual(int a, int b, int c){
        if (a < 0 || b < 0 || c < 0) {
            System.out.println(INVALID_VALUE);
            return;
        }
        if (a == b && a == c) {
            System.out.println("All numbers are equal");
            return;
        }
        if (a != b && a != c && b != c) {
            System.out.println("All numbers are different");
            return;
        }
        System.out.println("Neither all are equal or different");
        return;
    }
}
