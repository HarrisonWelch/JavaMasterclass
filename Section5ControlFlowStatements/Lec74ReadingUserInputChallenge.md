# Lec 74 ReadingUserInputChallenge

## Summary
* Read 10 numbers from the console by the suer and print the sum
* Create Scanner
* Use has next int for checking
  * If false, loop until you get a valid input
* Before input, print Enter number #x each time:
  * x represents a count
  * 

## My Solution
```java
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);

        boolean hasNextInt;
        int count = 0;
        int sum = 0;
        while (count < 10) {
            System.out.print("Enter number #" + (count+1) + ": ");
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                sum += scanner.nextInt();
                scanner.nextLine();
                count++;
            } else {
                System.out.println("Invalid number");
                scanner.nextLine();
            }
        }

        System.out.print("Sum = " + sum);

        scanner.close();
    }
}
```
