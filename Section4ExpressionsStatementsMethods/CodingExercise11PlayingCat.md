# Lec61p4PlayingCat.md

## Summary
* If any number is < 0 print invalid value
* If all 3 numbers are equal print "All numbers are equal"
* If all 3 numbers are different print "All numbers are different"
* Else print "Neither all are equal or different"

## Soltion
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // PlayingCat
        System.out.println("isCatPlaying(true, 25) = " + isCatPlaying(true, 25));
        System.out.println("isCatPlaying(false, 36) = " + isCatPlaying(false, 36));
        System.out.println("isCatPlaying(false, 35) = " + isCatPlaying(false, 35));
        System.out.println("isCatPlaying(true, 33) = " + isCatPlaying(true, 33));
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        return (summer) ?
                (temperature >= 25 && temperature <= 45) :
                (temperature >= 25 && temperature <= 35);
    }
}
```
Output
```
isCatPlaying(true, 25) = true
isCatPlaying(false, 36) = false
isCatPlaying(false, 35) = true
isCatPlaying(true, 33) = true
```
