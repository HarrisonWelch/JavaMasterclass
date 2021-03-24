package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        boolean hasNextInt;
        int count = 0;
        int sum = 0;

        // While the count remains lower than 10
        while (count < 10) {
            // Ask for a number
            System.out.print("Enter number #" + (count+1) + ": ");

            // See if the int is parse-able
            hasNextInt = scanner.hasNextInt();

            // if the int is parse-able
            if (hasNextInt) {
                // Add the int
                sum += scanner.nextInt();
                // flush the scanner
                scanner.nextLine();
                // increment the count (exit condition)
                count++;
            } else {
                // input was not int parsed
                // print Invalid
                System.out.println("Invalid number");
                // flush the scanner
                scanner.nextLine();
            }
        }

        // print the sum
        System.out.print("Sum = " + sum);

        // Close the scanner
        scanner.close();
    }
}
