package com.company;

public class Main {

    public static void main(String[] args) {
        // SumOdd
        System.out.println("sumOdd(  1,  100) = " + sumOdd(  1,  100));
        System.out.println("sumOdd( -1,  100) = " + sumOdd( -1,  100));
        System.out.println("sumOdd(100,  100) = " + sumOdd(100,  100));
        System.out.println("sumOdd( 13,   13) = " + sumOdd( 13,   13));
        System.out.println("sumOdd(100, -100) = " + sumOdd(100, -100));
        System.out.println("sumOdd(100, 1000) = " + sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0) return -1;
        if (end < start) return -1;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
