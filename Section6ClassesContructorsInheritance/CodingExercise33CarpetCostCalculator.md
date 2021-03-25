# Coding Exercise 33 Carpet Cost Calculator

## Solution
Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Coding Exercise 33 Carpet Cost Calculator
    }
}
```
Floor.java
```java
package com.company;

public class Floor {
    private double width;
    private double length;

    public Floor(double width, double length) {
        this.width = (width < 0) ? 0 : width;
        this.length = (length < 0) ? 0 : length;
    }

    public double getArea() {
        return this.width * this.length;
    }
}
```
Carpet.java
```java
package com.company;

public class Carpet {
    private double cost;

    public Carpet(double cost) {
        this.cost = (cost < 0) ? 0 : cost;
    }

    public double getCost() {
        return cost;
    }
}
```
Calculator.java
```java
package com.company;

public class Calculator {
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor, Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost() {
        return this.floor.getArea() * this.carpet.getCost();
    }
}
```
