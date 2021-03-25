# Lec 77 Classes Part 1

## Objects
* State
  * Wet, Dry
  * Alive, Dead
  * Number of legs
* Behavior
  * Actions
  * Make noise
  * Produce some output
  * Drink Water
* Objects have feilds for states
* Objects have methods for behaviors
* Allowes creation of customer data types

## Creation
* in the project left side column, right click, create new class
* Create "Car"
* A new file comes in "Car.java"
* Should be next to main in the proj directory

## Access Modifiers
* `public` - All classes can access
* `private` - No other classes can access
* `protected` - package access.
* For now, go with public and know that other classes have access without restriction

## Class Feilds
* Fields, member variables - save variables for each object
* Access modifiers are here as well - generally private

## Basic Car class
```java
package com.company;

public class Car {

    // Fields
    private int doors; // notices the access modifier
    private int wheels;
    private String model;
    private String engine;
    private String colour;

}
```
* To make a car object use `Car car = new Car();`
* Remember we cannot access this member vars (fields) 
