# Lec 83 Reference Vs Object Vs Instance Vs Class

## Words
* `Reference`
* `Object`
* `Instance`
* `Class`

## Analogy
* A class = A house
* A **`class`** is a blueprint is for a house
* Each house you build is an **`instance`**
* Each house you build has an address, that is a **`reference`**
* You can copy the reference as many times as you want, but its still just one house
* We can pass references to methods or constructors

## Class Creation
* Blueprint for Animal
```java
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
    ...
}
```

## Object
* Advanced custom data type
* below the `animal` object is made
```java
Animal animal = new Animal("Animal", 1, 1, 5, 5);
```

## Instance creation
* new keyword is used
* A new `object` is made in memory
```java
Animal animal = new Animal(
        "Animal",
        1,
        1,
        5,
        5
);
```

## Reference manipulation
* Assigning an object to an object
* `animal2` has the same ref of animal
* Any manip on `animal2` will apply to animal, b/c they are the same in memory
```java
Animal animal2 = animal;
```
