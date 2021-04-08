package com.company;

public class MyLinkedList implements NodeList {
    private ListItem root;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }
        ListItem curr = this.root;
        while (curr != null) {
            int comparison = (curr.compareTo(item));
            if (comparison < 0) {
                if (curr.next() != null) {
                    curr = curr.next();
                } else {
                    curr.setNext(item).setPrevious(curr);
                    return true;
                }
            } else if (comparison > 0) {
                if (curr.previous() != null) {
                    curr.previous().setNext(item).setPrevious(curr.previous());
                    item.setNext(curr).setPrevious(item);
                } else {
                    item.setNext(this.root).setPrevious(item);
                    this.root = item;
                }
                return true;
            } else {
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
