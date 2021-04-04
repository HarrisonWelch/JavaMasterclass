# Lec 99 Arrays

## Array
* Collection of data
* Data structure to store a sequence of values of the same type
* Strings - sequence of characters

## Code #1
* Make array
* For loop on array
* Print from array
* Print array independent of size

Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Example dec and init
        // int myVariable = 50;
         int[] myVariable; // Note the brackets; alerts Java to the array type
         myVariable = new int[10]; // 10 is the size of the array

        // Single line
        int[] myIntArray = new int[10];
        myIntArray[5] = 50; // This assigns the 6th element to 50. Arrays are indexed from ZERO.

        // Also works for other types
        double[] myDoubleArray = new double[10];

        // Access and print to console
        System.out.println(myIntArray[5]); // prints 50

        // initialize every value
        myIntArray[0] = 45;
        myIntArray[1] = 47;

        // Shorthand; only applies to the initializer
        int[] myIntArray2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(myIntArray2[0]); // prints 1
        System.out.println(myIntArray2[6]); // prints 7
        System.out.println(myIntArray2[8]); // prints 9

        // We can also use a for loop to initialize
        int[] myIntArray3 = new int[10];
        for (int i = 0; i < 10; i++) {
            myIntArray3[i] = i*10;
        }
        // Now demonstrate with a for loop print
        for (int i = 0; i < 10; i++) {
            System.out.println("Element " + i + ", value is " + myIntArray3[i]);
        }

        // You can also use the ".length" field to access the length of the area w/out hard coding
        for (int i = 0; i < myIntArray3.length; i++) {
            myIntArray3[i] = i*20;
        }
        // for (int i = 0; i < 10; i++) {
        //     System.out.println("Element " + i + ", value is " + myIntArray3[i]);
        // }
        printArray(myIntArray3);
        // this makes it easier to change the size of the array to say 20 and the loop would still work

        // Note you will get an "ArrayIndexOutOfBoundsException" exception if the loop starts too soon or goes too long
    }

    // Function to print array
    // Demonstrate how to pass array to function
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }
}
```
## Code #2
* Use scanner class to put ints into an array
* Average all elements in an array

Main.java
```java
package com.company;

import java.util.Scanner;

public class Main {

    // Using the scanner class with Arrays
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Spin up a new array and make it equal to the result of a function
        int[] myIntegers = getIntegers(5);

        // Print the array
        printArray(myIntegers);

        // Print the average of those numbers the users entered
        System.out.println("The average is " + getAverage(myIntegers));
    }

    // Use the scanner to get integers an pack them into a int[] array
    // Parameter number is the size of the array
    public static int[] getIntegers(int number) {
        // Alert user to enter numbers
        System.out.println("Enter " + number + " integer values.\r");

        // Make holding array
        int[] values = new int[number];

        // For each index in the array accept an answer
        for (int i = 0; i < values.length; i++) {
            // Accept number, put it in the values[i] index of the values array
            values[i] = scanner.nextInt();
        }

        // return the int[]
        return values;
    }

    // print each element of the array
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + ", value is " + array[i]);
        }
    }

    // get the average for every element in the int[] array
    public static double getAverage(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return ((double) sum / (double) array.length); // Must cast to double
    }
}
```
