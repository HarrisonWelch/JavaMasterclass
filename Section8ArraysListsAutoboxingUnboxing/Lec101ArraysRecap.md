# Lec 101 Arrays Recap

## Arrays
* Store multiple values of the same type in a single variable
* default values of numeric array elements are zero
* Zero indexed
  * Array of n elements goes from 0 to n-1 indexes
  * Array of 10 elements goes from 0 to 9 indexes
* Try to access an index out side of the range of an array and you will get an "ArrayIndexOutOfBoundsException"
* `[]` is the array access operator
  * Example `arr[i]`

## Example
```java
int[] array = new int[5];
```
* contains elemetns array[0] to array[4]
* 5 elements
* new keyword creates a new object and initalize to default value
* boolean is init to false
* String is set to null

## Example 2
```java
int[] array = {5,4,3,2,1};
```
* Inline initialization
* 5 elements 0 to 4
* Array initialized to 5,4,3,2,1
* Known as an anonymous array

## Common errors
```java
int[] array = {5,4,3,2,1};
int[5] = 0;
```
* the 5 index is the 6th element
* Throws `ArrayIndexOutOfBoundsException`

## Common errors 2
```java
int[] array = {5,4,3,2,1};
for (int i = 1; i < array.length; i++) {
    System.out.println("Element " + i + " = " + arr[i]);
}
```
* starting at 1 and not 0
* Won't use the 1st element at index 0

## Common errors 3
```java
int[] array = {5,4,3,2,1};
for (int i = 1; i <= array.length; i++) {
    System.out.println("Element " + i + " = " + arr[i]);
}
```
* Throws `ArrayIndexOutOfBoundsException`
* condition `<=` should be `<`
* This will allow element 5 to be accessed which does not exist.

