package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // Lec102ReferenceTypesVsValueTypes
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println("myIntValue = " + myIntValue); // 10
        System.out.println("anotherIntValue = " + anotherIntValue); // 10
        anotherIntValue++;
        System.out.println("myIntValue = " + myIntValue); // 10
        System.out.println("anotherIntValue = " + anotherIntValue); // 11

        // Arrays are reference types
        // Holds the reference/address to the object but not to the object itself
        int[] myIntArray = new int[5]; // Array with 5 elements init to zero
        int[] anotherArray = myIntArray; // These point at the same addr.

        System.out.println("myIntArray = " + Arrays.toString(myIntArray)); // [0, 0, 0, 0, 0]
        System.out.println("anotherArray = " + Arrays.toString(anotherArray)); // [0, 0, 0, 0, 0]

        anotherArray[0] = 1;

        System.out.println("after change myIntArray = " + Arrays.toString(myIntArray)); // [1, 0, 0, 0, 0]
        System.out.println("after change anotherArray = " + Arrays.toString(anotherArray)); // [1, 0, 0, 0, 0]
        // Note "anotherArray[0] = 1;" changed BOTH arrays. B/c they reference the same object.

        modifyArray(myIntArray);

        System.out.println("after modify myIntArray = " + Arrays.toString(myIntArray)); // [2, 0, 0, 0, 0]
        System.out.println("after modify anotherArray = " + Arrays.toString(anotherArray)); // [2, 0, 0, 0, 0]

        anotherArray = new int[] {4,5,6,7,8};

        System.out.println("after dereference myIntArray = " + Arrays.toString(myIntArray)); // [2, 0, 0, 0, 0]
        System.out.println("after dereference anotherArray = " + Arrays.toString(anotherArray)); // [4, 5, 6, 7, 8]

    }

    private static void modifyArray(int[] array) {
        array[0] = 2; // simple
        array = new int[] {1,2,3,4,5}; // will not affect the main method stuff
        // b/c a new ref was made
    }
}
