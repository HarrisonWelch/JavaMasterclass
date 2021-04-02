package com.company;

public class TV {
    private int size; // vertical
    private int depth;
    private String type;

    public TV(int size, int depth, String type) {
        this.size = size;
        this.depth = depth;
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public int getDepth() {
        return depth;
    }

    public String getType() {
        return type;
    }
}
