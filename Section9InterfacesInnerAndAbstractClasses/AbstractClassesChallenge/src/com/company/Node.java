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
