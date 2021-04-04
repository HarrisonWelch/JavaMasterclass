# Lec 104 Reverse Array Challenge

## Challenge
* reverse array
* Use referencing

## My solution

```java
package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    // Lec 104 Reverse Array Challenge
//        int[] arr = new int[] {1,2,3,4,5};
//        int[] arr = new int[] {1,2,3,4,5,6,7,8};
        int[] arr = new int[] {-1, 7, 98, 21, -45, 42, 68, 0};
        System.out.println(Arrays.toString(arr)); // Forwards
        reverseArray(arr);
        System.out.println(Arrays.toString(arr)); // Backwards
    }

    public static void reverseArray(int[] arr){
        int swap = 0;
        for (int i = 0; i < arr.length / 2; i++) {
            swap = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = swap;
        }
    }
}

```
output
```
[-1, 7, 98, 21, -45, 42, 68, 0]
[0, 68, 42, -45, 21, 98, 7, -1]
```
