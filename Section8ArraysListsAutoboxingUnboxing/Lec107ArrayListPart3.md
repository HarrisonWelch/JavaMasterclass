

## Code

Main.java

```java
package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
	    // write your code here
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // flush

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item in the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - Process ArrayList");
        System.out.println("\t 7 - To quit.");
    }

    public static void addItem() {
        System.out.println("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter item number: ");
        String itemNumber = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item name: ");
        String itemNo = scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }

    public static void searchForItem() {
        System.out.println("Item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " is not in our grocery list");
        }
    }

    public static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());

        ArrayList<String> nextArray = new ArrayList<>(groceryList.getGroceryList()); // Copy constructor

        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);

        System.out.println("groceryList = " + groceryList.getGroceryList().toString());
        System.out.println("newArray = " + newArray.toString());
        System.out.println("nextArray = " + nextArray.toString());
        System.out.println("myArray = " + Arrays.toString(myArray));
    }

}
```
GroceryList.java
```java
package com.company;

import java.util.ArrayList;

public class GroceryList {
    private int[] myNumbers = new int[50];

    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

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

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }

    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position+1) + " has been modified.");
        // position+1 b/c humans speak 1,2,3,... while computers speak 0,1,2,...
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("Removed item " + theItem);
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position = findItem(searchItem);
        return position >= 0;
    }

}
```
output
```

Press 
	 0 - To print choice options.
	 1 - To print the list of grocery items.
	 2 - To add an item to the list.
	 3 - To modify an item in the list.
	 4 - To remove an item in the list.
	 5 - To search for an item in the list.
	 6 - Process ArrayList
	 7 - To quit.
Enter your choice: 
2
Please enter the grocery item: 
Cheese
Enter your choice: 
2
Please enter the grocery item: 
Beef
Enter your choice: 
2
Please enter the grocery item: 
Milk
Enter your choice: 
1
You have 3 items in the grocery list.
1.Cheese
2.Beef
3.Milk
Enter your choice: 
6
groceryList = [Cheese, Beef, Milk]
newArray = [Cheese, Beef, Milk]
nextArray = [Cheese, Beef, Milk]
myArray = [Cheese, Beef, Milk]
Enter your choice: 
7

Process finished with exit code 0
```
