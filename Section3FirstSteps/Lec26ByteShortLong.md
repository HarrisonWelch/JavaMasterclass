# Lec26ByteShortLong

## Byte
* `byte` exists
* It takes up less space and less time to access
* Self-documenting, used with specific purpose

```java
package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10000;
        int myMinValue = Integer.MIN_VALUE;
        int myMaxValue = Integer.MAX_VALUE;

        System.out.println("Integer Minimum value = " + myMinValue);
        System.out.println("Integer Maximum value = " + myMaxValue);
        System.out.println("Busted MAX value = " + (myMaxValue + 1));
        System.out.println("Busted MIN value = " + (myMinValue - 1));

        int myMaxIntTest = 2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum value = " + myMinByteValue);
        System.out.println("Byte Maximum value = " + myMaxByteValue);
    }
}
```
Ouput
```
Byte Minimum value = -128
Byte Maximum value = 127
```

## Replace Selection
* Use Ctrl+R to activate a replace method
* replace `byte` with `short`
* replace `Byte` with `Short`
* gives this code
```java
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = " + myMinShortValue);
        System.out.println("Short Maximum value = " + myMaxShortValue);
```
Output
```
Short Minimum value = -32768
Short Maximum value = 32767
```

## Size of Primitive Types
* A Byte occupies 8 bits
  * A byte has a width of 8
* A Short has 16 bits, width of 16
* An Int has 32 bits, and has a width of 32
* Could come up as an interview question

## Long
* `long myLongValue = 100L;` Needs the `L` at the end to indicate the variable is a long
  * Case does not matter here, but it needs to be `L` and uppercase is easter to differentiate from a lower case `l` which could be a 1 `1` or an I `I`
* size is 2^63

## Back to the Code
* Adding in this
  
```java
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = " + myMinLongValue);
        System.out.println("Long Maximum value = " + myMaxLongValue);
```
Ouput
```
Long Minimum value = -9223372036854775808
Long Maximum value = 9223372036854775807
```

* Underscore numbers are still valid `long bigLongLiteralValue = 2_147_483_647_234L;`. The L is needed to interpret as long and not int.
* IJ will warn if too large.





