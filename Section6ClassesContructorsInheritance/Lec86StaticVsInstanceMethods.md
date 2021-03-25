# Lec 86 Static Vs Instance Methods

## Static Methods
* Declared using `static` modifier
* Can't access instance methods and instance variables from a class
* Used for operations that don't require any data from an instance of a class
* The this keyword is the current instance of a class
* We cannot use the `this` keyword'
* When not using instance variables that method should be static
  * Example `main`

## Example
* printSum accepts parameters and passes back result, never accessing class fields
```java
class Calculator {
    public static void printSum(int a, int b) {
        System.out.println("sum = " + (a + b));
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator.printSum(5, 10); // ClassName.methodName()
        printHello(); // access in the same class
    }
    public static void printHello() {
        System.out.println("Hello");
    }
}
```

## Instance Methods
* Have to make an instance before using
```java
class Dog {
    public void bark() {
        System.out.println("woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Dog rex = new Dog(); // create instance
        rex.bark(); // call instance method
    }
}
```
