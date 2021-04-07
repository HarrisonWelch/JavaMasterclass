# Lec 131 Abstract Classes Part 2

## Mistakes were made
* We screwed up last time.
* Fly should be an interface and not an abstract class
* This is because interfaces should be used for what a class can do
  * Flight as used in class inheritance can lead to some issues

## New code
CanFly.java
```java
package com.company;

public interface CanFly { // Note the fact this is not "ICanFly" its ok to break this rule sometimes
    void fly();
}
```
Bird.java

```java
package com.company;

public abstract class Bird extends Animal implements CanFly {
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

    @Override
    public void fly() {
        // from CanFly
        System.out.println(getName() + " is flapping its wings");
    }
}
```
