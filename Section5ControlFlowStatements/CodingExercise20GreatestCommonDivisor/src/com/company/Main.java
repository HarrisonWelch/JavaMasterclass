package com.company;

public class Main {

    public static void main(String[] args) {
        // CodingExercise20GreatestCommonDivisor
        System.out.println("getGreatestCommonDivisor(25, 15) = " + getGreatestCommonDivisor(25, 15));
        System.out.println("getGreatestCommonDivisor(12, 30) = " + getGreatestCommonDivisor(12, 30));
        System.out.println("getGreatestCommonDivisor(9, 18) = " + getGreatestCommonDivisor(9, 18));
        System.out.println("getGreatestCommonDivisor(81, 153) = " + getGreatestCommonDivisor(81, 153));

    }
    public static int getGreatestCommonDivisor(int first, int second) {
        if (first < 10 || second < 10) return -1;
        if (second % first == 0) return first;
        for( int i = first; i >= 2; i--) {
            if (first % i == 0 && second % i == 0) {
                return i;
            }
        }
        return -1;
    }
}
