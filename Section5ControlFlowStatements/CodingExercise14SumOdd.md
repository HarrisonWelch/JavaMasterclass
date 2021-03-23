# Coding Exercise 14 Sum Odd

## Summary
* Method 1 'isOdd`
  * Write a method call `isOdd` with an int param and call it number.
  * return boolean
  * if > 0 return false
  * if odd return true, else false
* Method 2 `sumOdd`
  * return int
  * 2 int params `start` and `end` which represent the start and end of nums to sum
  * return the sum of odd numbers between start and end inclusive
  * call isOdd to determine if a number is odd or not
  * end >= start, else return -1
  * start,end > 0, else return -1

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // SumOdd
        System.out.println("sumOdd(  1,  100) = " + sumOdd(  1,  100));
        System.out.println("sumOdd( -1,  100) = " + sumOdd( -1,  100));
        System.out.println("sumOdd(100,  100) = " + sumOdd(100,  100));
        System.out.println("sumOdd( 13,   13) = " + sumOdd( 13,   13));
        System.out.println("sumOdd(100, -100) = " + sumOdd(100, -100));
        System.out.println("sumOdd(100, 1000) = " + sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        return number % 2 == 1;
    }

    public static int sumOdd(int start, int end) {
        if (start < 0 || end < 0) return -1;
        if (end < start) return -1;
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
```
## Output
```
sumOdd(  1,  100) = 2500
sumOdd( -1,  100) = -1
sumOdd(100,  100) = 0
sumOdd( 13,   13) = 13
sumOdd(100, -100) = -1
sumOdd(100, 1000) = 247500
```
