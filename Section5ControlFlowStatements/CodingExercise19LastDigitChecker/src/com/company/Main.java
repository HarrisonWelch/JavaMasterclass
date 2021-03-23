package com.company;

public class Main {

    public static void main(String[] args) {
	    // CodingExercise19LastDigitChecker
        System.out.println("hasSameLastDigit(41, 22, 71) = " + hasSameLastDigit(41, 22, 71));
        System.out.println("hasSameLastDigit(23, 32, 42) = " + hasSameLastDigit(23, 32, 42));
        System.out.println("hasSameLastDigit(9, 99, 999) = " + hasSameLastDigit(9, 99, 999));
    }
    public static boolean hasSameLastDigit(int n1, int n2, int n3) {
        if (!isValid(n1) || !isValid(n2) || !isValid(n3)) {
            return false;
        }
        int n1_last_digit = n1 % 10;
        int n2_last_digit = n2 % 10;
        int n3_last_digit = n3 % 10;
        return n1_last_digit == n2_last_digit ||
               n1_last_digit == n3_last_digit ||
               n2_last_digit == n3_last_digit;
    }
    public static boolean isValid(int number) {
        return (number >= 10 && number <= 1000);
    }
}
