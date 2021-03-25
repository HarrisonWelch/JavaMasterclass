# Lec89InheritanceChallengePart2

## Code
Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Inheritance Challenge
        Outlander outlander = new Outlander(0,0,1,36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
    }
}
```

Vehicle.java
```java
package com.company;

public class Vehicle {

    private String name;
    private String size;

    private int currentVelocity;
    private int currentDirection;

    public Vehicle() {
    }

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + this.currentDirection + " degrees.");
    }

    public void move(int velocity, int direction) {
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle.move(): Moving at " + this.currentVelocity + " at " + this.currentDirection + " degrees.");
    }

    public void stop() {
        this.currentVelocity = 0; // stop
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public void setCurrentVelocity(int currentVelocity) {
        this.currentVelocity = currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }
}
```
Car.java
```java
package com.company;

public class Car extends Vehicle {

    private int wheels;
    private int doors;
    private int steering;
    private int gears;
    private int speed;
    private int currentGear;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        System.out.println("Setting current gear to: " + currentGear);
        this.currentGear = currentGear;
    }

    public Car() {
        super("Default name","Default size");
    }

    public Car(int steering, int gear, int speed) {
        super("Default name","Default size");
        this.steering = steering;
        this.gears = gear;
        this.speed = speed;
    }

    public Car(String name, String size, int steering, int gear, int speed) {
        super(name, size);
        this.steering = steering;
        this.gears = gear;
        this.speed = speed;
    }

    public Car(String name, String size, int wheels, int doors, int steering, int gears, int speed, int currentGear) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.steering = steering;
        this.gears = gears;
        this.speed = speed;
        this.currentGear = currentGear;
    }

    public int getSteering() {
        return steering;
    }

    public void setSteering(int steering) {
        this.steering = steering;
    }

    public int getGear() {
        return gears;
    }

    public void changeGears(int gear) {
        setCurrentGear(gear);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void changeVelocity(int speed, int direction) {
        move(speed, direction);
        System.out.println("Car.changeVelocity(): Moving at " + speed + " at " + direction + " degrees.");
    }

    @Override
    public void stop() {
        super.stop();
    }
}
```
Outlander.java
```java
package com.company;

public class Outlander extends Car{
    private int roadServiceMonths;

    public Outlander(int steering, int speed, int currentGear, int roadServiceMonths) {
        super("Outlander", "4WD", 5, 5, steering, 6, speed, currentGear);
        this.roadServiceMonths = roadServiceMonths;
    }

    public void accelerate(int rate) {
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0) {
            stop();
            changeGears(1);
        } else if (newVelocity > 0 && newVelocity <= 10) {
            changeGears(1);
        } else if (newVelocity > 10 && newVelocity <= 20) {
            changeGears(2);
        } else if (newVelocity > 20 && newVelocity <= 30) {
            changeGears(3);
        } else {
            changeGears(4);
        }

        if (newVelocity > 0) {
            changeVelocity(newVelocity, getCurrentDirection());
        }
    }
}
```