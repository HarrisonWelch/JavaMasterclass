# Lec75MinAndMaxChallenge

## Summary
* read numbers from user and print the minimum and maximum they entered
* Before the user enters a number print "Enter number:"
* If the number is invalid, break out of the loop and print the min and max

## My Solution
```java
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // MinAndMaxChallenge

        // Spawn a new scanner obj
        Scanner scanner = new Scanner(System.in);

        // minimum number found, set to max
        int min = Integer.MAX_VALUE;

        // maximum number found, set to min
        int max = Integer.MIN_VALUE;

        // num found from user, read-ability
        int num = 0;

        // Infinite loop, exit condition internal
        while (true){
            // Ask user for input
            System.out.print("Enter number:");

            // If the input can be parsed as int
            if (scanner.hasNextInt()) {
                // parse the input to int, store in num
                num = scanner.nextInt();

                // flush scanner
                scanner.nextLine();

                // if the num is more than the max, max becomes num
                if (num > max) {
                    max = num;
                }

                // if the num is less than the min, min becomes num
                if (num < min) {
                    min = num;
                }
            } else {
                // Number is not parse-able as int
                System.out.print("Invalid Number");
                // exit the loop now
                break;
            }
        }

        // print max
        System.out.println("Max = " + max);
        // print min
        System.out.println("Min = " + min);

        // safely close scanner
        scanner.close();
    }
}
```
