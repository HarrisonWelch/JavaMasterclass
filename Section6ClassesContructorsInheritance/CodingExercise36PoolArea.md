# Coding Exercise 36 Pool Area

## Solution
Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Write your code here
        Rectangle rectangle = new Rectangle(5, 10);
        System.out.println("rectangle.width = " + rectangle.getWidth());
        System.out.println("rectangle.length = " + rectangle.getLength());
        System.out.println("rectangle.area = " + rectangle.getArea());
        System.out.println("----");
        Cuboid cuboid = new Cuboid(5, 10, 5);
        System.out.println("cuboid.width = " + cuboid.getWidth());
        System.out.println("cuboid.length = " + cuboid.getLength());
        System.out.println("cuboid.area = " + cuboid.getWidth());
        System.out.println("cuboid.height = " + cuboid.getHeight());
        System.out.println("cuboid.volume = " + cuboid.getVolume());

    }
}
```
Rectangle.java
```java
package com.company;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea() {
        return this.length * this.width;
    }
}
```
Cuboid.java
```java
package com.company;

public class Cuboid extends Rectangle {
    private double height;

    public Cuboid(double width, double length, double height) {
        super(width, length);
        this.height = (height < 0) ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return this.height * getArea();
    }
}
```
output
```
rectangle.width = 5.0
rectangle.length = 10.0
rectangle.area = 50.0
----
cuboid.width = 5.0
cuboid.length = 10.0
cuboid.area = 5.0
cuboid.height = 5.0
cuboid.volume = 250.0
```
