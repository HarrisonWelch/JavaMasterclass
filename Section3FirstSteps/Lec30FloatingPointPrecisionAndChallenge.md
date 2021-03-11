# Lec30FloatingPointPrecisionAndChallenge

## Division
* Division by 2
```java
        int myIntValue = 5 / 2;
        float myFloatValue = 5f / 2f;
        double myDoubleValue = 5d / 2d; // d is for double, optional when going into a double
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
```
Ouput
```
myIntValue = 2
myFloatValue = 2.5
myDoubleValue = 2.5
```

* Division by 3
```java
        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d; // d is for double, optional when going into a double
        System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        System.out.println("myDoubleValue = " + myDoubleValue);
```
Ouput
```
myIntValue = 1
myFloatValue = 1.6666666
myDoubleValue = 1.6666666666666667
```
* Notice the percision bump in float
* .00 can be subbed for `d` at the end to imply double numbers

## Challenge
* Create var for storing pounds
* Create a var for kilos for when converting lbs to kilos
* Print result

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // var to store number of pounds
        double numPounds = 5.0;
        double numKilos = numPounds * 0.45359237;
        System.out.println("numKilos = " + numKilos);

    }
}

```
Ouput
```
numKilos = 2.2679618500000003
```

## Other
* Underscores still work
* Legal Code:
```java
double pi = 3.1415927d;
double anotherNumber  = 3_000_000.4_567_890d;
System.out.println(pi);
System.out.println(anotherNumber);
```
Ouput
```
3.1415927
3000000.456789
```

## BigDecimal
* float and double are limited
* BigDecimal class overcomes this
* More detail later


