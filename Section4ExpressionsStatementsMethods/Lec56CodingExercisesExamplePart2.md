# Lec56CodingExercisesExamplePart2

## Constructing the 2nd method `printConversion`

Main
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        SpeedConverter.printConversion(1.5);
        SpeedConverter.printConversion(10.25);
        SpeedConverter.printConversion(-5.6);
        SpeedConverter.printConversion(25.42);
        SpeedConverter.printConversion(75.114);
    }
}
```
SpeedConverter
```java
package com.company;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0.00d) return -1;
        return Math.round(kilometersPerHour * 0.621371);
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0.00d) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(
                kilometersPerHour + " km/h = " +
                SpeedConverter.toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}

```
Output
```
1.5 km/h = 1 mi/h
10.25 km/h = 6 mi/h
Invalid Value
25.42 km/h = 16 mi/h
75.114 km/h = 47 mi/h
```
