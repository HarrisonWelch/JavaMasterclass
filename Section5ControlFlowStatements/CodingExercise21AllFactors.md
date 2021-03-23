# Coding Exercise 21 All Factors

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // CodingExercise21AllFactors
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
    }
    public static void printFactors(int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println("");
    }
}
```
output
```
1 2 3 6 
1 2 4 8 16 32 
1 2 5 10 
Invalid Value
```

