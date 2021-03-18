# Lec38AssignmentVsEqualTo

## Challenge - Easy to cross = with ==

```java
        int newValue = 50;
        if (newValue = 50) {
            System.out.println("This is an error");
        }
```

### Explain

* `newValue = 50` - IntelliJ is saying this is returning an int
* This is assigning, not comparing

### Correction

```java
        int newValue = 50;
        if (newValue == 50) { // <---
            System.out.println("This is true");
        }
```

## Another Example - assignment returns value assigned

```java
        boolean isCar = false;
        if (isCar = true) {
            System.out.println("This is not supposed to happen");
        }
```

### Explain

This will execute the sys out line because `isCar = true` is assigning true then using the returned true value in the if statement test.

### Correction

```java
        boolean isCar = false;
        if (!isCar) { // if the var is not true exe the sys out statement
            System.out.println("This is not supposed to happen");
        }
```

## The not `!` operator
* `!` - flips the boolean value.
  * false -> true
  * true -> false

### Example
* `isCar == false` - returns true if the var is false, else true
* `!isCar` - returns true if the var is false, else true
  * if the var is false it is flipped to true, true is then evaluated and the if statement block is executed.
  * if the var is true it is flipped to false

