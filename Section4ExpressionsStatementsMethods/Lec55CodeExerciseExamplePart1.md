# Lec55CodeExerciseExamplePart1

Main
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("SpeedConverter.toMilesPerHour(1.5) = " + SpeedConverter.toMilesPerHour(1.5));
        System.out.println("SpeedConverter.toMilesPerHour(10.25) = " + SpeedConverter.toMilesPerHour(10.25));
        System.out.println("SpeedConverter.toMilesPerHour(-5.6) = " + SpeedConverter.toMilesPerHour(-5.6));
        System.out.println("SpeedConverter.toMilesPerHour(25.42) = " + SpeedConverter.toMilesPerHour(25.42));
        System.out.println("SpeedConverter.toMilesPerHour(75.114) = " + SpeedConverter.toMilesPerHour(75.114));
    }

}
```

Class SpeedConverter
```java
package com.company;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0.00d) return -1;
        return Math.round(kilometersPerHour * 0.621371);
    }
}
```

output
```
SpeedConverter.toMilesPerHour(1.5) = 1
SpeedConverter.toMilesPerHour(10.25) = 6
SpeedConverter.toMilesPerHour(-5.6) = -1
SpeedConverter.toMilesPerHour(25.42) = 16
SpeedConverter.toMilesPerHour(75.114) = 47
```
