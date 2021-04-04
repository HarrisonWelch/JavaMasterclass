# Coding Exercise 41 Sorted Array

## Challenge
* Same as Lec92
* Methods:
  * getIntegers - returns array of entered ints
  * printArray - prints out of the contents of the array
  * sortIntegers - sort array and return
    * figure out how to copy them into a new array

## Solution

```java
import java.util.Scanner;

public class SortedArray {
    // write code here

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
```
output
```
Enter numbers:
1
2
3
4
5
Element 0 contents 5
Element 1 contents 4
Element 2 contents 3
Element 3 contents 2
Element 4 contents 1
```