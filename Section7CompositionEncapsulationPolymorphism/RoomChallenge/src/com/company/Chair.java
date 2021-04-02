package com.company;

public class Chair {
    private boolean hasPerson;
    private int width;
    private int height;
    private int depth;

    public Chair(boolean hasPerson, int width, int height, int depth) {
        this.hasPerson = hasPerson;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public boolean isHasPerson() {
        return hasPerson;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getDepth() {
        return depth;
    }
}
