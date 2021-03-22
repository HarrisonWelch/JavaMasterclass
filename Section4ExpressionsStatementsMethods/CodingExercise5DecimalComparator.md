# Lec57p5CodingExercise5DecimalComparator

## Solution
```java
package com.company;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double num1, double num2){
        DecimalFormat df = new DecimalFormat("#######.###");
        df.setRoundingMode(RoundingMode.DOWN);
        return (df.format(num1)).equals(df.format(num2));
    }
}

```

## Test Main

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("DecimalComparator.areEqualbyThreeDecimalPlaces(-3.1756, -3.175) = " +
                DecimalComparator.areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println("DecimalComparator.areEqualbyThreeDecimalPlaces(-3.176, -3.175) = " +
                DecimalComparator.areEqualByThreeDecimalPlaces(-3.176, -3.175));
        System.out.println("DecimalComparator.areEqualbyThreeDecimalPlaces(3.0, 3.0) = " +
                DecimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println("DecimalComparator.areEqualbyThreeDecimalPlaces(-3.123, 3.123) = " +
                DecimalComparator.areEqualByThreeDecimalPlaces(-3.123, 3.123));
    }
}
```
output
```
DecimalComparator.areEqualbyThreeDecimalPlaces(-3.1756, -3.175) = true
DecimalComparator.areEqualbyThreeDecimalPlaces(-3.176, -3.175) = false
DecimalComparator.areEqualbyThreeDecimalPlaces(3.0, 3.0) = true
DecimalComparator.areEqualbyThreeDecimalPlaces(-3.123, 3.123) = false
```
