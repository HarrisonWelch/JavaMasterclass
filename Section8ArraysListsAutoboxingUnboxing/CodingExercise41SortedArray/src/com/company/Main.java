package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        printArray(sortIntegers(getIntegers(5)));
    }
    public static int[] getIntegers(int number) {
        System.out.println("Enter numbers:\r");
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[number];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Element " + i + " contents " + arr[i]);
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
