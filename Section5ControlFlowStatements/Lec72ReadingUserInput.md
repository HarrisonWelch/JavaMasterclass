# Lec 72 Reading User Input

## Goal
* Create an application for reading user input
* Learn the scanner class

## Notes
* `new` is a keyword to create a new instance of an object. Such as the scanner class.
* 

## Basic Scanner usage
```java
// Define a new scanner obj
Scanner scanner = new Scanner(System.in);

// Print a message asking for the user to type their name
System.out.println("Enter your name: ");

// Save the next line they enter to var "name"
String name = scanner.nextLine();

// Print name, proving we grabbed
System.out.println("Your name is " + name);

// Close the scanner for safety
scanner.close();
```

## Adding in a year to figure age
* Combining NextInt with NextLine
* IMPORTANT NOTE: Recommended that you call next line after a nextInt, nextFloat, ...

```java
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        // Define a new scanner obj
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth: ");
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
        System.out.println("Your name is " + name + ", and you are " + age + " years old.");

        // Close the scanner for safety
        scanner.close();
    }
}
```
