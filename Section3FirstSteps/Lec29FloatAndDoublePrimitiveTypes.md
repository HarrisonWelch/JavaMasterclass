# Lec29FloatAndDoublePrimitiveTypes

## Floating Point Numbers
* Use decimal
* Not Whole
* Pi is an example, 3.14159...
* Precision

## Single Precision and Double Precision
* Single is 32 bits and width of 32
* Double is 64, width of 64
* Double is twice as precise as Single

```java
package com.company;

public class Main {

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float minimum value = " + myMinFloatValue);
        System.out.println("Float maximum value = " + myMaxFloatValue);
        
        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double minimum value = " + myMinDoubleValue);
        System.out.println("Double maximum value = " + myMaxDoubleValue);

        int myIntValue = 5;
//        float myFloatValue = 5; // int is default no need to use the back letter
//        float myFloatValue = 5f; // f is for float, optional when going into a float
//        double myDoubleValue = 5;  // int is default no need to use the back letter
        double myDoubleValue = 5d; // d is for double, optional when going into a double
//        float myFloatValue = 5.25; // does not work because decimals default to double literal
        float myFloatValue = (float) 5.25;
    }
}
```
Ouput
```
Float minimum value = 1.4E-45
Float maximum value = 3.4028235E38
Double minimum value = 4.9E-324
Double maximum value = 1.7976931348623157E308
```