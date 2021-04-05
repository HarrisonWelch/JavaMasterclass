# Lec 105 List And Array List Part 1

## Why switch to ArrayList from normal arrays?
* Dynamic sizing
* Self-documenting add/remove
* Abstract away any array resizing
* You could resize an array yourself, but that be
  * Too much work
  * Too much copy/paste
  * This work has been done for you

## Resize an array the "old-fashioned" way (DONT DO THIS)
Main.java
```java
package com.company;

import java.util.Scanner;

public class Main {

    private static int[] baseData = new int[10];
    private static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
	    // write your code here
        System.out.println("Enter 10 integers:");
        getInput();
        printArray(baseData);
        resizeArray();
        System.out.println("Enter 12 integers:");
        getInput();
        printArray(baseData);
    }

    private static void getInput() {
        for (int i = 0; i < baseData.length; i++) {
            baseData[i] = s.nextInt();
        }
    }

    private static void printArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    private static void resizeArray() {
        int[] original = baseData;
        baseData = new int[original.length+2];
        for(int i = 0; i < original.length; i++) {
            baseData[i] = original[i];
        }
    }
}
```

## List
* Interface implemented by ArrayList
* Implemented by ArrayList

## ArrayList
* Uses Generic E so it can take on any one type
* Dynamic sizing

## Example Grocery List class
```java
package com.company;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers = new int[50];

    private ArrayList<String> groceryList = new ArrayList<>();

    public void addGroceryItem(String item) {
        groceryList.add(item); // Automatically add an item to the list
        // Where it goes is "abstracted". Java takes care of this while you focus on the application.
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " items in the grocery list.");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + "." + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position+1) + " has been modified.");
        // position+1 b/c humans speak 1,2,3,... while computers speak 0,1,2,...
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Removed item " + theItem);
    }

}
```
