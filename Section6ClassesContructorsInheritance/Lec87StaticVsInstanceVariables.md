# Lec 87 Static Vs Instance Variables

## Static Variables
* Defined using keyword `static`
* AKA static member variables
* Each instances of the class shares the same static variable.
* If changes are made, all classes will be affected.
* Not used very often
* We can declare Scanner as a static variable so all classes can access it directly.

## Static Variables Example
* This a bad place for a static var, but can show
```java
class Dog {
    private static String name;

    public Dog(String name) {
        Dog.name = name;
    }

    public void printName() {
        System.out.println("name= " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy");
        rex.printName(); // prints fluffy
        fluffy.printName(); // prints fluffy
    }
}
```
output
```
name= fluffy
name= fluffy
```
* Notice the 2nd creation made the 1st named fluffy as well? changes to static methods are felt across all instances


## Instance Variables
* Don't use `static`
* Belong to each object
  * Has its own blueprinted verison of the member variable
  * Changes to 1 will not affect others
* AKA fields, member variables

## Instance Variables Example
```java

class Dog {
    private String name;

    public Dog(String name) {
        Dog.name = name;
    }

    public void printName() {
        System.out.println("name= " + name);
    }
}

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog("rex");
        Dog fluffy = new Dog("fluffy");
        rex.printName(); // prints rex
        fluffy.printName(); // prints fluffy
    }
}
```
output
```
name= rex
name= fluffy
```