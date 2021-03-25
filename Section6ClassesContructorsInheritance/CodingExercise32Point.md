# Coding Exercise 32 Point

## Summary
* Class: Point
* Fields: x,y both int
* Method: distance
  * Overload 1: empty args - get distance from origin
  * Overload 2: x and y ints - get distance from the object to the x,y passed in
  * Overload 3: Point - get distance from object to the point.

## Solution
Main.java
```java
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
```
