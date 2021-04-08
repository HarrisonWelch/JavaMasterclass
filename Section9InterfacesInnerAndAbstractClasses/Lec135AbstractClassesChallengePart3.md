# Lec 134 Abstract Classes Challenge Part 3

## BST in java
SearchTree.java
```java
package com.company;

public class SearchTree implements NodeList {

    private ListItem root = null;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (this.root == null) {
            // the tree was empty, so our item becomes the head of the tree
            this.root = newItem;
            return true;
        }

        // otherwise, start comparing from the head of the tree
        ListItem currItem = this.root;
        while (currItem != null) { // this can be while true, but put this way is more readable
            int comparison = (currItem.compareTo(newItem));
            if (comparison < 0) {
                // newItem is greater, move right if possible
                if (currItem.next() != null) {
                    currItem = currItem.next();
                } else {
                    currItem.setNext(newItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, move left if possible
                if (currItem.previous() != null) {
                    currItem = currItem.previous();
                } else {
                    currItem.setPrevious(newItem);
                    return true;
                }
            } else {
                System.out.println(newItem.getValue() + " is already present");
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
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(item));
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem item, ListItem parent) {
        // remove item from the tree
        if (item.next() == null) {
            if (parent.next() == item) {
                // item is right child of its parent
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                // item is left child of its parent
                parent.setPrevious(item.previous());
            } else {
                // parent must be item, which means we are looking at the root of the tree
                this.root = item.previous();
            }
        } else if (item.previous() == null) {
            // no left tree, so make parent point to right tree
            if (parent.next() == item) {
                // item is right child of its parent
                parent.setNext(item.next());
            } else if (parent.previous() == item) {
                // item is left child of its parent
                parent.setPrevious(item.next());
            } else {
                // again, we are deleting the root
                this.root = item.next();
            }
        } else {
            // neither left nor right are null, deletion is not a lot harder
            // From the right sub-tree, find the smallest value (i.e. the leftmost)
            ListItem current = item.next();
            ListItem leftmostParent = item;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }
            // Now put the smallest value into our node to be deleted
            item.setValue(current.getValue());
            // and delete the smallest
            if (leftmostParent == item) {
                // there was no leftmost node, so 'current' points to the smallest
                // node (the one that must now be deleted)
                item.setNext(current.next());
            } else {
                // set the smallest nodes parent to point to
                // the smallest node's right child (which may be null)
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        // recursive method
        if (root != null) { // note, left and right nodes are null by default.
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
```