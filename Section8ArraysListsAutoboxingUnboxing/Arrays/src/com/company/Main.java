package com.company;

import java.util.Scanner;

public class Main {

    // Using the scanner class with Arrays
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Spin up a new array and make it equal to the result of a function
        int[] myIntegers = getIntegers(5);

        // Print the array
        printArray(myIntegers);

        // Print the average of those numbers the users entered
        System.out.println("The average is " + getAverage(myIntegers));
    }

    // Use the scanner to get integers an pack them into a int[] array
    // Parameter number is the size of the array
    public static int[] getIntegers(int number) {
        // Alert user to enter numbers
        System.out.println("Enter " + number + " integer values.\r");

        // Make holding array
        int[] values = new int[number];

        // For each index in the array accept an answer
        for (int i = 0; i < values.length; i++) {
            // Accept number, put it in the values[i] index of the values array
            values[i] = scanner.nextInt();
        }

        // return the int[]
        return values;
    }

    // print each element of the array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    // get the average for every element in the int[] array
    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return ((double) sum / (double) array.length); // Must cast to double
    }
}
