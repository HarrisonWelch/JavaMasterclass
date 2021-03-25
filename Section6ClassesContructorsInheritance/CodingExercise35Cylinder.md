# Coding Exercise 35 Cylinder

## Solution
Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Coding Exercise 35 Cylinder
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius = " + circle.getRadius());
        System.out.println("circle.area = " + circle.getArea());
        Cylinder cyclinder = new Cylinder(5.55, 7.25);
        System.out.println("cyclinder.radius = " + cyclinder.getRadius());
        System.out.println("cyclinder.height = " + cyclinder.getHeight());
        System.out.println("cyclinder.area = " + cyclinder.getArea());
        System.out.println("cyclinder.volume = " + cyclinder.getVolume());

    }
}
```
Circle.java
```java
package com.company;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = (radius < 0) ? 0 : radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }
}
```
Cylinder.java
```java
package com.company;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = (height < 0) ? 0 : height;
    }

    public double getHeight() {
        return height;
    }

    public double getVolume() {
        return getArea() * height;
    }
}
```
