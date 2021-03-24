package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        // Define a new scanner obj
        Scanner scanner = new Scanner(System.in);

        // Ask user for input
        System.out.println("Enter your year of birth: ");

        // Check for valid int input
        boolean hasNextInt = scanner.hasNextInt(); // tells us if it has an int, without removing from the scanner

        // If the input is ok (has int) proceed
        if (hasNextInt) {
            // Capture year of birth
            int yearOfBirth = scanner.nextInt();

            // Recommended that you call next line after a nextInt, nextFloat, ...
            scanner.nextLine(); // output ignored

            // Basic find age of user
            int age = 2018 - yearOfBirth;

            // Print a message asking for the user to type their name
            System.out.println("Enter your name: ");

            // Save the next line they enter to var "name"
            String name = scanner.nextLine();

            // Print name, proving we grabbed
            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + ", and you are " + age + " years old.");
            } else {
                System.out.println("Invalid year of birth");
            }
        }
        // Close the scanner for safety
        scanner.close();
    }
}
