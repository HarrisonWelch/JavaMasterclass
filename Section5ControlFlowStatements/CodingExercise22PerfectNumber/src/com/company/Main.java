package com.company;

public class Main {

    public static void main(String[] args) {
	    // CodingExercise22PerfectNumber
        System.out.println("isPerfectNumber(6) = " + isPerfectNumber(6));
        System.out.println("isPerfectNumber(28) = " + isPerfectNumber(28));
        System.out.println("isPerfectNumber(5) = " + isPerfectNumber(5));
        System.out.println("isPerfectNumber(-1) = " + isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        if (number < 1) return false;
        int sumOfDivisors = 0;
        for (int i = 1; i <= number-1; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;
            }
        }
        return sumOfDivisors == number;
    }
}
