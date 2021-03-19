# Lec57p4CodingExercise4LeapYearCalculator

## Solution
```java
package com.company;

public class LeapYear {
    public static boolean isLeapYear(int year){
        if (year < 1 || year > 9999) return false;
        return (year % 4 == 0 && !(year % 100 == 0)) || year % 400 == 0;
    }
}
```

## Test Main

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("LeapYear.isLeapYear(-1600) = " + LeapYear.isLeapYear(-1600));
        System.out.println("LeapYear.isLeapYear(1600) = " + LeapYear.isLeapYear(1600));
        System.out.println("LeapYear.isLeapYear(2017) = " + LeapYear.isLeapYear(2017));
        System.out.println("LeapYear.isLeapYear(2000) = " + LeapYear.isLeapYear(2000));
    }
}
```
output
```
LeapYear.isLeapYear(-1600) = false
LeapYear.isLeapYear(1600) = true
LeapYear.isLeapYear(2017) = false
LeapYear.isLeapYear(2000) = true
```
