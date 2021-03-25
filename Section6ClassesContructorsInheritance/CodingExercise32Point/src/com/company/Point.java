package com.company;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public double distance(int x2, int y2) {
        return Math.sqrt(Math.pow((this.x - x2), 2) + Math.pow((this.y - y2), 2));
    }

    public double distance(Point p2) {
        return Math.sqrt(Math.pow((this.x - p2.getX()), 2) + Math.pow((this.y - p2.getY()), 2));
    }
}
