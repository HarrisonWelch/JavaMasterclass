# Lec 130 Abstract Classes Part 1

## Code
Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Write your code here
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

//        Bird bird = new Bird("Parrot");
        Parrot parrot = new Parrot("Austrailian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
```
Animal.java
```java
package com.company;

public abstract class Animal {

    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
```
Dog.java
```java
package com.company;

// java: com.company.Dog is not abstract and does not override abstract method breathe() in com.company.Animal
public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }
}
```
Bird.java
```java
package com.company;

public abstract class Bird extends Animal {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }

    public abstract void fly();
}
```
Parrot.java
```java
package com.company;

public class Parrot extends Bird {
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("Flitting from branch to branch");
    }
}
```
Penguin.java
```java
package com.company;

public class Penguin extends Bird {
    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        System.out.println("I'm not very good at that, can I go for a swim instead?");
    }
}
```
output
```
Breathe in, breathe out, repeat
Yorkie is eating
Breathe in, breathe out, repeat
Austrailian ringneck is pecking
Flitting from branch to branch
I'm not very good at that, can I go for a swim instead?
```
