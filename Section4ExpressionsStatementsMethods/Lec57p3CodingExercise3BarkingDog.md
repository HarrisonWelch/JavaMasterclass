# Lec57p3CodingExercise3BarkingDog

## Solution
```java
package com.company;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23) return false;
        return (barking && (hourOfDay > 22 || hourOfDay < 8));
    }
}
```

## Test Main

```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("BarkingDog.shouldWakeUp(true, 1) = " + BarkingDog.shouldWakeUp(true, 1));
        System.out.println("BarkingDog.shouldWakeUp(true, 1) = " + BarkingDog.shouldWakeUp(false, 2));
        System.out.println("BarkingDog.shouldWakeUp(true, 1) = " + BarkingDog.shouldWakeUp(true, 8));
        System.out.println("BarkingDog.shouldWakeUp(true, 1) = " + BarkingDog.shouldWakeUp(true, -1));
    }
}
```
output
```
BarkingDog.shouldWakeUp(true, 1) = true
BarkingDog.shouldWakeUp(true, 1) = false
BarkingDog.shouldWakeUp(true, 1) = false
BarkingDog.shouldWakeUp(true, 1) = false
```
