# Lec 67 Sum 3 And 5 Challenge

## Summary
* Create a for statement using a range of numbers from 1 to 1000 inclusive
* Sum all the numbers that can be divided with both 3 and also with 5
* For those numbers that met the above conditions, print out the number.
* break out of the loop once you find 5 number that met the above conditions.
* After breaking out the loop print the sum of the numbers that met the above conditions
* Note: Type all code in the main method

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // Sum 3 And 5 Challenge
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Found Number = " + i);
                sum += i;
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("Sum = " + sum);
    }
}
```
output
```
Found Number = 15
Found Number = 30
Found Number = 45
Found Number = 60
Found Number = 75
Sum = 225
```

