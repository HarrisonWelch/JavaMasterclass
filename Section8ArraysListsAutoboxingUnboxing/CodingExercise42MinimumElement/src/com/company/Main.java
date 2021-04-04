package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Write your code here
        System.out.println(findMin(readElements(readInteger())));
    }

    private static int readInteger(){
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.nextLine();
        return x;
    }

    private static int[] readElements(int count){
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[count];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private static int findMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
