# Lec27CastingInJava

## Casting
* `int myTotal = (myMinValue / 2);` works
* But `byte myNewByteValue = (myMinByteValue / 2);` does not because Java by default ouputs integers on arithmetic operations.
* For this we put `(byte)` in front to case the int to byte.
  * Full line:
```java
byte myNewByteValue = (byte) (myMinByteValue / 2);
```
* The same works for short 
```java
short myNewShortValue = (short) (myMinShortValue / 2);
```

## Code update

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
        
        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum value = " + myMinShortValue);
        System.out.println("Short Maximum value = " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum value = " + myMinLongValue);
        System.out.println("Long Maximum value = " + myMaxLongValue);

        long bigLongLiteralValue = 2_147_483_647_234L;

        short bigShortLiteralValue = 32767;

        int myTotal = (myMinValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2); // default output is integer
        short myNewShortValue = (short) (myMinShortValue / 2); // default output is integer

    }
}
```
Output
```
"C:\Program Files\Amazon Corretto\jdk11.0.10_9\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.2\lib\idea_rt.jar=51872:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2020.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\...\Section3FirstSteps\ByteShortIntLong\out\production\ByteShortIntLong com.company.Main
Integer Minimum value = -2147483648
Integer Maximum value = 2147483647
Busted MAX value = -2147483648
Busted MIN value = 2147483647
Byte Minimum value = -128
Byte Maximum value = 127
Short Minimum value = -32768
Short Maximum value = 32767
Long Minimum value = -9223372036854775808
Long Maximum value = 9223372036854775807

Process finished with exit code 0

```
