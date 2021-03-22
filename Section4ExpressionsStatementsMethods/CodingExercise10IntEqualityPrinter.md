# Lec 61 p3 Int Equality Printer

## Summary
* If any number is < 0 print invalid value
* If all 3 numbers are equal print "All numbers are equal"
* If all 3 numbers are different print "All numbers are different"
* Else print "Neither all are equal or different"

## Solution
```java
package com.company;

public class Main {

    private static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {
        // IntEqualityPrinter
        printEqual(1,1,1);
        printEqual(1,1,2);
        printEqual(-1,-1,-1);
        printEqual(1,2,3);
    }

    public static void printEqual(int a, int b, int c){
        if (a < 0 || b < 0 || c < 0) {
            System.out.println(INVALID_VALUE);
            return;
        }
        if (a == b && a == c) {
            System.out.println("All numbers are equal");
            return;
        }
        if (a != b && a != c && b != c) {
            System.out.println("All numbers are different");
            return;
        }
        System.out.println("Neither all are equal or different");
        return;
    }
}
```
Output
```
All numbers are equal
Neither all are equal or different
Invalid Value
All numbers are different
```
