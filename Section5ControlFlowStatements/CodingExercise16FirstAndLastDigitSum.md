# Coding Exercise 16 First And Last Digit Sum

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // CodingExercise16FirstAndLastDigitSum
        System.out.println("sumFirstAndLastDigit(252) = " + sumFirstAndLastDigit(252));
        System.out.println("sumFirstAndLastDigit(257) = " + sumFirstAndLastDigit(257));
        System.out.println("sumFirstAndLastDigit(0) = " + sumFirstAndLastDigit(0));
        System.out.println("sumFirstAndLastDigit(5) = " + sumFirstAndLastDigit(5));
        System.out.println("sumFirstAndLastDigit(-10) = " + sumFirstAndLastDigit(-10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) return -1;
        int firstDigit = number % 10;
        int lastDigit = 0;
        while (number > 0) {
            lastDigit = number;
            number /= 10;
        }
        return (firstDigit + lastDigit);
    }
}
```
output
```
sumFirstAndLastDigit(252) = 4
sumFirstAndLastDigit(257) = 9
sumFirstAndLastDigit(0) = 0
sumFirstAndLastDigit(5) = 10
sumFirstAndLastDigit(-10) = -1
```
