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
