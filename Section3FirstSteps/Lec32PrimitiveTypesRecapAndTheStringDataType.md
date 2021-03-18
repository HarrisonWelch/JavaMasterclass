# Lec32PrimitiveTypesRecapAndTheStringDataType

## Types
* byte
* short
* int
* long
* float
* double
* char
* boolean

## String
* Not primitive type
* Actually a class
  * treated differently, favoritism
* Sequence of chars (unlike char that holds only 1)
* Limited by the memory value of int

## Code

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean
        String myString = "This is a string"; // Make string
        System.out.println("myString is equal to " + myString); // Print it out to the console

        // Append
        myString = myString + ", and this is more."; // append
        System.out.println("myString is equal to " + myString); // Print again to show change from append

        // Use the char unicode stuff from eariler
        myString = myString + " \u00A9 2019"; // append
        System.out.println("myString is equal to " + myString); // Print again to show change from append
        String numberString = "250.55";
        numberString = numberString + "49.95"; // PROBLEM: This concatenation and not addition
        System.out.println("numberString is equal to " + numberString);

        // String concat
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt; // Adding numeric to string, PROBLEM: This concatenation and not addition
        System.out.println("lastString is equal to " + lastString); // Print again to show change from append
        // Java converts the int to string and concatenates.

        // This also works with doubles.
        double number = 120.47d;
        lastString = lastString + number; // Adding numeric to string, PROBLEM: This concatenation and not addition
        System.out.println("lastString is equal to " + lastString); // Print again to show change from append

    }
}
```
Output
```
myString is equal to This is a string
myString is equal to This is a string, and this is more.
myString is equal to This is a string, and this is more. © 2019
numberString is equal to 250.5549.95
lastString is equal to 1050
lastString is equal to 1050120.47
```

## Strings in Java are Immutable
* Not strictly true
* A new string is created on an append action
* The variable now references the new string
  * Net result is the same
* Append is inefficent
  * Buffer is better
  * Can be changed

## Summary
* Strings are easy to use compared to classes
* Can be treated as the 9th Primitive types





















