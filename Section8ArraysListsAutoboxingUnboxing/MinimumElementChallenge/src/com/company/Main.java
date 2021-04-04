package com.company;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    // Write your code here
        System.out.println("Enter how many numbers you want to enter:\r");
        int count = scanner.nextInt();
        int[] arr = readIntegers(count);
        System.out.println("The minimum is " + findMin(arr));
    }

    public static int[] readIntegers(int count) {
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter a number:\r");
            arr[i] = scanner.nextInt();
            scanner.nextLine();
        }
        return arr;
    }

    public static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
