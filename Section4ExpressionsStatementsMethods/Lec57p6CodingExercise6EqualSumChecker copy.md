# Lec57p6CodingExercise6EqualSumChecker

## Solution
```java
package com.company;

public class EqualSumChecker {
    public static boolean hasEqualSum(int num1, int num2, int num3){
        return (num1 + num2) == num3;
    }
}
```

## Test Main

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("EqualSumChecker.hasEqualSum(1, 1, 1) = " + EqualSumChecker.hasEqualSum(1, 1, 1));
        System.out.println("EqualSumChecker.hasEqualSum(1, 1, 2) = " + EqualSumChecker.hasEqualSum(1, 1, 2));
        System.out.println("EqualSumChecker.hasEqualSum(1, -1, 0) = " + EqualSumChecker.hasEqualSum(1, -1, 0));
    }
}
```
output
```
EqualSumChecker.hasEqualSum(1, 1, 1) = false
EqualSumChecker.hasEqualSum(1, 1, 2) = true
EqualSumChecker.hasEqualSum(1, -1, 0) = true
```
