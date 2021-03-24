# Coding Exercise 27 Input Calculator

## Summary
* Make function inputThenPrintSumAndAverage
* No params
* Void return type
* Until the user sends in non-int input, keep adding and counting the numbers input by the user
* At the end, print the output `"SUM = XX AVG = YY"`

## Solution

```java
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

```
Example Output
```
-1
5
7
bg
SUM = 11 AVG = 4
``
