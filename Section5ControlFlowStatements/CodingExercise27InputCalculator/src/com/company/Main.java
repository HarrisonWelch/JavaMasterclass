package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // CodingExercise27InputCalculator
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int avg = 0;
        while (true) {
            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                scanner.nextLine();
                count++;
            } else {
                break;
            }
        }
        if (count != 0) {
            avg = (int) Math.round(((double) sum)/ ((double) count));
        } else {
            avg = sum;
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
