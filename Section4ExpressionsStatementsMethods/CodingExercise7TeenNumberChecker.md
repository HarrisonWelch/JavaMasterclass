# Lec57p7CodingExercise7TeenNumberChecker

## Solution
```java
package com.company;

public class TeenNumberChecker {
    public static boolean hasTeen(int p1, int p2, int p3){
        return isTeen(p1) ||
               isTeen(p2) ||
               isTeen(p3);
    }
    public static boolean isTeen(int p1){
        return (p1 >= 13 && p1 <= 19);
    }
}
```

## Test Main

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("TeenNumberChecker.hasTeen( 9,99,19) = " + TeenNumberChecker.hasTeen( 9,99,19));
        System.out.println("TeenNumberChecker.hasTeen(25,15,42) = " + TeenNumberChecker.hasTeen(25,15,42));
        System.out.println("TeenNumberChecker.hasTeen(22,23,24) = " + TeenNumberChecker.hasTeen(22,23,24));

        System.out.println("TeenNumberChecker.isTeen( 9) = " + TeenNumberChecker.isTeen( 9));
        System.out.println("TeenNumberChecker.isTeen(13) = " + TeenNumberChecker.isTeen(13));
    }
}
```
output
```
TeenNumberChecker.hasTeen( 9,99,19) = true
TeenNumberChecker.hasTeen(25,15,42) = true
TeenNumberChecker.hasTeen(22,23,24) = false
TeenNumberChecker.isTeen( 9) = false
TeenNumberChecker.isTeen(13) = true
```
