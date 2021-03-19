# Lec57p1CodingExercise1SpeedConverter

## Solution
```java
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int megeBytes = kiloBytes / 1024;
        int kiloBytesRemainder = kiloBytes % 1024;
        System.out.println(kiloBytes + " KB = "+megeBytes+" MB and "+kiloBytesRemainder+" KB");
    }
```

## Test Main

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        MegaBytesConverter.printMegaBytesAndKiloBytes(2500);
        MegaBytesConverter.printMegaBytesAndKiloBytes(-1024);
        MegaBytesConverter.printMegaBytesAndKiloBytes(5000);
    }
}
```
output
```
2500 KB = 2 MB and 452 KB
Invalid Value
5000 KB = 4 MB and 904 KB
```
