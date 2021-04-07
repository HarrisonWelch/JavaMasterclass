# Lec 127 Inner Classes Part 1

## Inner Class
* Static
* Non-Static
  * "Inner class"
* Local
* Anonymous
  * Without class name

## Code Part 1
Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Write your code here

        Gearbox mcLaren = new Gearbox(6);

        // Access an inner class
        Gearbox.Gear first = mcLaren.new Gear(1, 12.3);

        // ERROR: "java: an enclosing instance that contains com.company.Gearbox.Gear is required"
        // Gearbox.Gear second = new Gearbox.Gear(2, 15.4);

        // ERROR: "java: package mcLaren does not exist"
        // Gearbox.Gear third = new mcLaren.Gear(3, 17.8);

        System.out.println(first.driveSpeed(1000));

        // Usually an inner class is going to be private anyway
    }
}
```
Gearbox.java
```java
package com.company;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int gearNumber = 0; // stays the same

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    // INNER CLASS
    public class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {

            this.gearNumber = gearNumber; // resolved to this class first
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * this.ratio;
        }
    }
}
```

More often than not inner classes are going to be private to the outer class they are implemented in

## Refactored code
Gearbox.java
```java
package com.company;

import java.util.ArrayList;

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0; // stays the same
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int number, double ratio) {
        if ((number > 0) && number <= maxGears) {
            this.gears.add(new Gear(number, ratio));
        }
    }

    public void changeGear(int newGear) {
        if (newGear >= 0 && newGear < this.gears.size() && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear " + newGear + " selected.");
        } else {
            System.out.println("Grind");
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream!!!");
            return 0.0;
        }
        return revs * gears.get(currentGear).getRatio();
    }

    // INNER CLASS
    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {

            this.gearNumber = gearNumber; // resolved to this class first
            this.ratio = ratio;
        }

        public double driveSpeed(int revs) {
            return revs * this.ratio;
        }

        public double getRatio() {
            return ratio;
        }
    }
}
```
