# Lec 84 This Vs Super

## Super
* Used to access/call the parent class members (variables and methods).
* Commonly used with method overriding
  * Calling the parent class
* Can also be used on the constructor to set up parent feilds
* Calls parent constructor

## This
* Used to call current class members
* Required when we have a field = parameter in name
* Commonly used in constructors and setters of a class
  * can be avoided using different names in the paramaters or feilds
* Can be used in a constructor in order to access a different constructor with a different number of args usually

Note: We can use both except in static areas. Attempts to do so lead to compile-time errors.

## Abstract class
* More on them later
* Even they can constructors
* Cannot instantiate
* This is still a super calls, so its constructors run when someone makes an instance of a concrete class.

Note: A constructor can call this() or super() but never both.

## `this()` example
* Known as constructor chaining
* 3rd constructor does all the work
* Removes copy/paste (duplicate) code
* Adds to modularity
```java
class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    // 1st constructor
    public Rectangle() {
        this(0, 0); // calls 2nd constructor
    }

    // 2nd constructor
    public Rectangle(int width, int height) {
        this(0, 0, width, height); // calls 3rd constructor
    }

    // 3rd constructor
    public Rectangle(int x, int y, int width, int height) {
        // initialize variables
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
}
```

## `super()` example
* 2nd constructor calls the parent class constructor
* Here we have both `super()` and `this()`

```java
class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle {
    private int width;
    private int height;

    // 1st constructor
    public Rectangle(int x, int y) {
        this(x, y, 0, 0); // calls 2nd constructor
    }

    // 2nd constructor
    public Rectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
}
```
