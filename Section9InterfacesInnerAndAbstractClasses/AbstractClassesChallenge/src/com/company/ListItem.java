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
