package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("sumDigits(125) = " + sumDigits(125));
        System.out.println("sumDigits(-1) = " + sumDigits(-1));
        System.out.println("sumDigits(9) = " + sumDigits(9));
        System.out.println("sumDigits(8675309) = " + sumDigits(8675309));
        System.out.println("sumDigits(12) = " + sumDigits(12));
    }
    public static int sumDigits(int number) {
        if (number < 10) return -1;

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
