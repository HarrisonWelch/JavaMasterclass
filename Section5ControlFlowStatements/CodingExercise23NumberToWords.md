# Coding Exercise 23 Number To Words

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // CodingExercise23NumberToWords
        System.out.println("getDigitCount(0) = " + getDigitCount(0));
        System.out.println("getDigitCount(123) = " + getDigitCount(123));
        System.out.println("getDigitCount(-12) = " + getDigitCount(-12));
        System.out.println("getDigitCount(5200) = " + getDigitCount(5200));
        System.out.println("reverse(-121) = " + reverse(-121));
        System.out.println("reverse(1212) = " + reverse(1212));
        System.out.println("reverse(1234) = " + reverse(1234));
        System.out.println("reverse(100) = " + reverse(100));
        System.out.println("reverse(100) = " + reverse(100));
        numberToWords(123);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
    }

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }
        if (number == 0) {
            System.out.print("Zero" + " ");
            return;
        }
        int reverse = reverse(number);
        int old_reverse = reverse;
        while (reverse > 0) {
            switch (reverse % 10){
                case 0:
                    System.out.print("Zero" + " ");
                    break;
                case 1:
                    System.out.print("One" + " ");
                    break;
                case 2:
                    System.out.print("Two" + " ");
                    break;
                case 3:
                    System.out.print("Three" + " ");
                    break;
                case 4:
                    System.out.print("Four" + " ");
                    break;
                case 5:
                    System.out.print("Five" + " ");
                    break;
                case 6:
                    System.out.print("Six" + " ");
                    break;
                case 7:
                    System.out.print("Seven" + " ");
                    break;
                case 8:
                    System.out.print("Eight" + " ");
                    break;
                case 9:
                    System.out.print("Nine" + " ");
                    break;
            }
            reverse /= 10;
        }
        if (getDigitCount(number) != getDigitCount(old_reverse)) {
            int diff = getDigitCount(number) - getDigitCount(old_reverse);
            for (int i = 0; i < diff; i++) {
                System.out.print("Zero" + " ");
            }
        }
        System.out.println("");
    }

    public static int reverse(int number) {
        boolean isNegative = number != Math.abs(number);
        number = Math.abs(number);
        int reverse = 0;
        int place = (int) Math.pow(10, getDigitCount(number)-1);
        int n = number;
        while (n > 0) {
            reverse += (n % 10) * place;
            place = place / 10;
            n /= 10;
        }

        return isNegative ? (-1 * reverse) : reverse;
    }

    public static int getDigitCount(int number){
        if (number < 0) return -1;
        return (number + "").length();
    }
}
```
output
```
getDigitCount(0) = 1
getDigitCount(123) = 3
getDigitCount(-12) = -1
getDigitCount(5200) = 4
reverse(-121) = -121
reverse(1212) = 2121
reverse(1234) = 4321
reverse(100) = 1
reverse(100) = 1
One Two Three 
One Zero One Zero 
One Zero Zero Zero 
Invalid Value
```
