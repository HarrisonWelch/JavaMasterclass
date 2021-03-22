# Lec 61 p2 Minutes To Years Days Calculator

## Problem Summary
* Convert minutes to years and days
* If < 0 print invalid value

## Solution
```java
package com.company;

public class Main {
    private static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {
        // MinutesToYearsDaysCalculator
        printYearsAndDays(525600);
        printYearsAndDays(1051200);
        printYearsAndDays(561600);

    }
    public static void printYearsAndDays(long minutes){
        if (minutes < 0) {
            System.out.println(INVALID_VALUE);
            return;
        }
        long years = minutes / (365 * 24 * 60);
        long days = (minutes % (365 * 24 * 60)) / (24*60);
        System.out.println(minutes + " min = " + years + " y and " + days + " d");
        return;
    }
}
```
Output
```
525600 min = 1 y and 0 d
1051200 min = 2 y and 0 d
561600 min = 1 y and 25 d
```

