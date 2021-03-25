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
