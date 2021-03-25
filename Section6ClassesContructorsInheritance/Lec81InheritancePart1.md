# Lec 81 Inheritance Part 1

## Inheritance
* Use methods from parent class
* Improve code-reuse
* Better modularity

## Code
Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Inheritance
        Animal animal = new Animal(
                "Animal",
                1,
                1,
                5,
                5
        );
        Dog dog = new Dog(
                "Yorkie",
                8,
                20,
                2,
                4,
                1,
                20,
                "long silky"
        );

        // This is when inheritance makes sense

        dog.eat(); // this function was defined on the parent class
        // We overrode this method in dog, else it would default to the animal class
    }
}
```
Animal.java
```java
package com.company;

public class Animal {
    private String name;
    private int brain;
    private int body;
    private int size;
    private int weight;

    public Animal(String name, int brain, int body, int size, int weight) {
        this.name = name;
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
    }

    public void eat() {
        System.out.println("Animal.eat() called."); // prove this function was called and executed.
    }

    public void move() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBrain() {
        return brain;
    }

    public void setBrain(int brain) {
        this.brain = brain;
    }

    public int getBody() {
        return body;
    }

    public void setBody(int body) {
        this.body = body;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
```
Dog.java
```java
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
}
```
