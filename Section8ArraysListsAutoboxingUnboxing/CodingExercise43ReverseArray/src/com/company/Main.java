package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        int[] arr = {1,2,3,4,5};
        reverse(arr);
//        System.out.println(Arrays.toString(arr));
    }
    private static void reverse(int[] arr){
        System.out.println("Array = " + Arrays.toString(arr));
        int swap = 0;
        for (int i = 0; i < arr.length/2; i++) {
            swap = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = swap;
        }
        System.out.println("Reversed array = " + Arrays.toString(arr));
    }
}
