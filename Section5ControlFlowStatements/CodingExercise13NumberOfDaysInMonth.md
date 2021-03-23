# CodingExercise13NumberOfDaysInMonth

## Summary
* Method 1 `isLeapYear`
  * Write a method called isLeapYear
  * return boolean
  * single param year, type int
  * param needs to be >= 1 and <= 9999
  * If outside return false
  * return true if the year sent in is a leap year, else false
  * A year is a leap year if divisible by 4, but not if divisible by 100, unless it is divisible by 400 then it is again

* Method 2 `getDaysInMonth`
  * two params month and year, both type int
  * if month < 1 or > 12 return -1
  * if year < 1 or > 9999 return -1
  * return the number of days in a month. Feb has 29 on a leap year
  * Use the isleapyear function


## Solution 
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // CodingExercise13NumberOfDaysInMonth
        System.out.println("isLeapYear(-1600) = " + isLeapYear(-1600));
        System.out.println("isLeapYear(1600) = " + isLeapYear(1600));
        System.out.println("isLeapYear(2017) = " + isLeapYear(2017));
        System.out.println("isLeapYear(2000) = " + isLeapYear(2000));
        System.out.println("----");
        System.out.println("getDaysInMonth(1, 2020) = " + getDaysInMonth(1, 2020));
        System.out.println("getDaysInMonth(2, 2020) = " + getDaysInMonth(2, 2020));
        System.out.println("getDaysInMonth(2, 2018) = " + getDaysInMonth(2, 2018));
        System.out.println("getDaysInMonth(-1, 2020) = " + getDaysInMonth(-1, 2020));
        System.out.println("getDaysInMonth(1, -2020) = " + getDaysInMonth(1, -2020));
    }

    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999) return false;
        return (year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0;
    }

    public static int getDaysInMonth(int month, int year){
        if (year < 1 || year > 9999) return -1;
        switch (month) {
            case 1: // JAN
            case 3: // MAR
            case 5: // MAY
            case 7: // JUL
            case 8: // AUG
            case 10: // OCT
            case 12: // DEC
                return 31;
            case 4: // APR
            case 6: // JUN
            case 9: // SEP
            case 11: // NOV
                return 30;
            case 2: // FEB
                if (isLeapYear(year)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return -1;
        }
    }
}
```
Output
```
isLeapYear(-1600) = false
isLeapYear(1600) = true
isLeapYear(2017) = false
isLeapYear(2000) = true
----
getDaysInMonth(1, 2020) = 31
getDaysInMonth(2, 2020) = 29
getDaysInMonth(2, 2018) = 28
getDaysInMonth(-1, 2020) = -1
getDaysInMonth(1, -2020) = -1
```
