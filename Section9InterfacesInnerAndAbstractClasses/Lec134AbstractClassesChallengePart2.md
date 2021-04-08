# Lec 134 Abstract Classes Challenge Part 2
Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Write your code here

        MyList list = new MyList(null);
        list.traverse(list.getRoot());

//        String stringData = "Darwin Brisbane Perth Melbourne Canberra Adelaide Sydney Canberra";
        String stringData = "5 7 3 9 8 2 1 0 4 6";

        String[] data = stringData.split(" ");
        for (String s : data) {
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());

        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("5"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("0"));
        list.removeItem(new Node("4"));
        list.removeItem(new Node("2"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("9"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("8"));
        list.traverse(list.getRoot());

        list.removeItem(new Node("6"));
        list.traverse(list.getRoot());

        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());

        // try and remove again?
        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());

    }
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
            return true;
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
                    this.root = item;
                }
                return true;
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
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison == 0) {
                // found item to delete
                if (currentItem == this.root) {
                    this.root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                }
                return true;
            } else if (comparison < 0) {
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                // We are at an item greater than one delete
                // item not in list
                return false;
            }
        }
        // We have reached the end of the list
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
```
