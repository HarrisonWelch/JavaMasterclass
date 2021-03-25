package com.company;

public class Dog extends Animal {

    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {
        super(name, 1, 1, size, weight); // Note the super function
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew() {
        System.out.println("Dog.chew() called.");
    }

    @Override // We are overriding a parent class method
    public void eat() {
        System.out.println("Dog.eat() called");
        chew(); // chew food
        super.eat(); // call parent
    }

    public void walk() {
        System.out.println("Dog.walk() called");
        move(5);
        // super.move(5); also works but if we ever decide to change this class
        // to override move then we have to change this code
    }

    public void run() {
        System.out.println("Dog.run() called");
        move(10);
    }

    private void moveLegs() {
        System.out.println("Dog.moveLegs() called");
    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs();
        super.move(speed);
    }
}
