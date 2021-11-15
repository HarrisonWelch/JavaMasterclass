package com.challenge.lib;

public class Series {
    public static int nSum(int n){
        if (n < 0) return -1;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += i;
        }

        return sum;
    }
    public static int factorial(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;

        int prod = 1;

        for (int i = 1; i < (n+1); i++) {
            prod *= i;
        }

        return prod;

    }
    public static int fibonacci(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;

        int a = 1;
        int b = 1;
        int i = 0;

        for(; i < (n-1); i++) {
            if (i % 2 == 0) {
                a = a + b;
            } else {
                b = a + b;
            }
        }

        return (i % 2) == 0 ? a : b;
    }
}
