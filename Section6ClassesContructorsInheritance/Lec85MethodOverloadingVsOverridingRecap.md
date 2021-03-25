# Lec 85 Method Overloading Vs Overriding Recap

## Overloading
* Same name different functionality
* Different number/type of args
* Improves readablility
* Minimizes diplicate code
* Don't have to remember many method names
  * Speed up dev time
* NOTHING to do with polymorphism
  * Sometimes referred to as "Compile Time Polymorphism"
* We can overload static and instance methods
  * More on that later
* Happens in a single class usually
  * "usually" b/c a subclass can inherit a class then overload it

## Overloading Rules
* Same name
* Different parameters
* Optional: different return types
* Optional: different access modifiers (`public`, `private`, `protected`)
* Optional: throw diff exceptions
  * More on that later

## Overriding
* Define a method in a parent class
* Same name and same arguments (same signature)
* By extending the parent class the child class gets all the methods defined in the parent class
* AKA Runtime polymorphism
* AKA Dynamic Method Dispatch
* Recommended to put `@Override` above the overrided function
  * Compiler will throw error if we don't override
  * Checks to see if a code change broke the app
* Can't override static methods, only instance methods

## Overriding rules
* Same name
* Same args
* return type can be a subclass of the return type in the parent class
* Can't have a lower access modifier
  * Can't be more private, but can be less public
* Only inherited methods can be overridden
* Constructors and private methods cannot be overridden
* Methods that are `final` cannot be overridden
* A child can use `super.methodName()` to call the parent class verison of the overridden method

## Overloading example
```java
class Dog {
    public void bark() {
        System.out.println("woof");
    }

    // Same name, 1 arg instead of 0.
    public void bark(int number) {
        for(int i = 0; i < number; i++) {
            System.out.println("woof");
        }
    }
}
```

## Overriding example
```java
class Dog {
    public void bark() {
        System.out.println("woof");
    }
}

class GermanShepard extends Dog {

    @Override
    public void bark() {
        System.out.println("woof woof woof");
    }
}
```

## Recap
| | Method Overloading      | Method Overriding |
| ----------- | ----------- | ----------- |
| Description | Provide functionality to reuse a method name with diff parameters | Override a behavior inherited from a parent class |
| Cross-class? | Usually in a single class, but can be used in a child class (optional) | **Always in two classes.** Child is-a parent |
| Signature | **Must have** different parameters | **Must have** same parameters and same name |
| Return type | Must have different return type | **Must have** same return type or covariant type (child class) |
| Access Level | May be different | **Must not** be lower modifier. Cannot be more private than the parent |
| Exceptions | May throw different exceptions | **Must NOT** throw a new or broader checked exception |

## Covarient Type
* HealthyBurger is a covarient type of Burger
* So I can return a HealthyBurger from the overriden `createBurger()` method b/c it is a child
```java
class Burger {
    // feilds, methods ...
}

class HealthyBurger extends Burger {
    // feilds, methods ...
}

class BurgerFactory {

    public Burger createBurger() {
        return new Burger();
    }
}
class HealthyBurgerFactory extends BurgerFactory {

    @Override
    public HealthyBurger createBurger() {
        return new HealthyBurger();
    }
}
```
