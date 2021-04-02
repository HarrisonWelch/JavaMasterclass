package com.company;

public class Sofa {
    private int numPeople;
    private int width;
    private int height;
    private int depth;

    public Sofa(int numPeople, int width, int height, int depth) {
        this.numPeople = numPeople;
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int getNumPeople() {
        return numPeople;
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
