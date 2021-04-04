# Lec 92 Arrays Challenge

## Challenge
* Create a program using arrays that sorts a list of ints in desc order
  * high low
* Read ints from keyboard
* Methods:
  * getIntegers - returns array of entered ints
  * printArray - prints out of the contents of the array
  * sortIntegers - sort array and return
    * figure out how to copy them into a new array

## Solution
Main.java
```java
package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    // Arrays Challenge
        int[] arr = getIntegers(5);
        printArray(arr);
        arr = sortIntegers(arr);
        printArray(arr);
    }

    public static int[] getIntegers(int number) {
        System.out.println("Enter numbers:\r");
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " = " + arr[i]);
        }
    }

    public static int[] sortIntegers(int[] arr) {
        int[] arrSorted = new int[arr.length];
        int greatest = Integer.MIN_VALUE;
        int greatest_index = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > greatest) {
                    greatest = arr[j];
                    greatest_index = j;
                }
            }
            arrSorted[i] = greatest;
            arr[greatest_index] = Integer.MIN_VALUE;
            greatest = Integer.MIN_VALUE;
        }
        return arrSorted;
    }
}
```
output
```
Enter numbers:
1
2
3
4
5
Element 0 = 1
Element 1 = 2
Element 2 = 3
Element 3 = 4
Element 4 = 5
Element 0 = 5
Element 1 = 4
Element 2 = 3
Element 3 = 2
Element 4 = 1
```
