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
