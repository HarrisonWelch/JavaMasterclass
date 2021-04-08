# Lec 133 Abstract Classes Challenge Part 1

* For this challenge, create an abstract class to define items that can be stored in a list.
* The class should contain 2 references to items which will represent the next and previous items (in the case of a linked list).
  * I.e., if you call your abstract class ListItem, then it would have 2 member variables of type ListItem that will hold references to the next/right and previous/left ListItems.
* The abstract class will also need to hold a value - try to be as flexible as possible when defining the type of this value.
* The class will also need methods to move to the next item and back to the previous item, and methods to set the next and previous items.
* You should also specify a compareTo() method that takes a parameter of the same type as the class and returns 0 if the values are equal, greater than zero if the value sorts greater than the parameter and less than zero if it sorts less than the parameter.
* Create a concrete class from your abstract list item class and use this in a LinkedList  class to implement a linked list that will add items in order (so that they are sorted alphabetically). Duplicate values are not added.
* Note that you are creating your own LinkedList class here, not using the built-in Java one..
* The rules for adding an item to the linked list are:
* If the head of the list is null, make the head refer to the item to be added.
* If the item to be added is less than the current item in the list, add the item before the current item (i.e., make the previous item's "next" refer to the new item, and the new item's "next" refer to the current item).
*  If the item to be added is greater than the current item, move onto the next item and compare again (if there is no next item then that is where the new item belongs).
* Care will be needed when inserting before the first item in the list (as it will not have a previous item).
* You will also need a method to remove an item from the list.
* Hint: If you are creating classes with names such as List, LinkedList, Node etc, make sure that you create your classes before referring to them. In previous videos we have often referred to classes that we create later, but if you use names that IntelliJ recognises as Java classes (such as LinkedList) then it will create imports for them and possibly cause you problems later.
* Optional: create a class to use your concrete class to implement a Binary Search Tree:
* When adding items to a Binary Search Tree, if the item to be added is less than the current item then move to the left, if it is greater than the current item then move to the right.
* The new item is added when an attempt to move in the required direction would involve following a null reference.
* Once again, duplicates are not allowed.
* Hint: to avoid typing loads of "addItem" lines, split a string into an array and create your list in a loop as in the example below.
* Create a string data array to avoid typing loads of addItem instructions:

```java
String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";

String[] data = stringData.split(" ");
for (String s : data) {
	//* create new item with value set to the string s
}
```

## Solution, mostly the instructors here
ListItem.java
```java
package com.company;

public abstract class ListItem {
    protected Object value;
    protected ListItem leftItem;
    protected ListItem rightItem;

    public ListItem(Object value) {
        this.value = value;
        this.leftItem = null;
        this.rightItem = null;
    }

    abstract ListItem next();
    abstract ListItem setNext(ListItem listItem);
    abstract ListItem previous();
    abstract ListItem setPrevious(ListItem listItem);

    abstract int compareTo(ListItem item);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

}
```
Node.java
```java
package com.company;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    @Override
    ListItem next() {
        return this.rightItem;
    }

    @Override
    ListItem setNext(ListItem listItem) {
        this.rightItem = listItem;
        return this.rightItem;
    }

    @Override
    ListItem previous() {
        return this.leftItem;
    }

    @Override
    ListItem setPrevious(ListItem listItem) {
        this.leftItem = listItem;
        return this.leftItem;
    }

    @Override
    int compareTo(ListItem item) {
        if (item != null) {
            return ((String) super.getValue()).compareTo((String) item.getValue());
        } else {
            return -1;
        }
    }
}
```
NodeList.java
```java
package com.company;

public interface NodeList {
    ListItem getRoot();
    boolean addItem(ListItem item);
    boolean removeItem(ListItem item);
    void traverse(ListItem root);
}
```
MyList.java
```java
package com.company;

import java.util.List;

public class MyList implements NodeList {
    private ListItem root = null;

    public MyList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            // The list is empty, so this item becomes the head of the list
            this.root = item;
        }
        ListItem curr = this.root;
        while (curr != null) {
            int comparison = (curr.compareTo(item));
            if (comparison < 0) {
                // new Item is greater, move right if possible
                if (curr.next() != null) {
                    curr = curr.next();
                } else {
                    // there is no next, so insert at the end of the list
//                    curr.setNext(item);
//                    item.setPrevious(curr);
                    curr.setNext(item).setPrevious(curr); // shortcut
                    return true;
                }
            } else if (comparison > 0) {
                // new item is less, insert before
                if (curr.previous() != null) {
//                    curr.previous().setNext(item);
//                    item.setPrevious(curr.previous());
                    curr.previous().setNext(item).setPrevious(curr.previous());
//                    item.setNext(curr);
//                    curr.setPrevious(item);
                    item.setNext(curr).setPrevious(item);
                } else {
                    // the node without a previous is the root
//                    item.setNext(root);
//                    this.root.setPrevious(item);
                    item.setNext(this.root).setPrevious(item);
                }
            } else {
                // equal
                System.out.println(item.getValue() + " is already present, not added.");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        
    }
}
```
