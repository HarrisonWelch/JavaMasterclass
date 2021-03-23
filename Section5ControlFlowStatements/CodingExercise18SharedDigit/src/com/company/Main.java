package com.company;

public class Main {

    public static void main(String[] args) {
        // CodingExercise18SharedDigit
        System.out.println("hasSharedDigit(12, 23) = " + hasSharedDigit(12, 23));
        System.out.println("hasSharedDigit(9, 99) = " + hasSharedDigit(9, 99));
        System.out.println("hasSharedDigit(15, 55) = " + hasSharedDigit(15, 55));
    }

    public static boolean hasSharedDigit(int x, int y){
        if (x < 10 || y < 10 || x > 99 || y > 99) return false;
        int y_temp = y;
        int digit_x = 0;
        int digit_y = 0;
        while (x > 0){
            digit_x = x % 10;
            while (y_temp > 0) {
                digit_y = y_temp % 10;
                if (digit_x == digit_y) {
                    return true;
                }
                y_temp /= 10;
            }
            y_temp = y;
            x /= 10;
        }
        return false;
    }
}
