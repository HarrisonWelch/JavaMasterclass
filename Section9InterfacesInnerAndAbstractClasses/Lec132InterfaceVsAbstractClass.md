# Lec 132 Interface Vs Abstract Class

## Abstract Class
* Very similar to Interfaces
* Cannot instantiate them
* They may contain a mix of methods declared with or without an implementation
* You can declare feilds that are not static and final and define public, protected, and private concrete methods
* Can extend one parent but implement multiple interfaces
* When subclassed
  * The subclass ususually provides implementations for all abstract methods in its parent class
  * If it does not, the subclass but also be declared abstract

## When to use an abstract class
* You want to share code between closely related classes
* You expect classes to extend your abstract class to have many common methods or fields or required access modifiers
* You want to declare non static or non final fields
  * enables you to define methods that change the state of an object
* When you have the requirement for your base class to provide a default implementation of certain methods but other methods should be open to being overridden by child class
* **Summary**: The purpose of an abstract class is to provide a common definition of a base class that multiple derived classes can share.

## Interface
* Just a declaration of methods of a class
  * NOT implementation
* Here we define what kind of operation an object can perform (abilities)
* These operations are defined by the classes that implement the Interface
* Interfaces form a contract between the class and outside world
  * contract enforced a compile time
* CANNOT instatiate them
* Contain a mix of methods declared with or without implementation
* All methods are automatically public and abstract
* An interface can extend another interface
* Interfaces are alot more flexible
* Introduce points of variation
* Decouipling the what from the how
* Since Java 8, interfaces can contain default methods
  * keyword default is used for backwards compatibility
* Since Java 9, interfaces can contain private methods
  * Common when two methods share common code

## When to us an interface
* When you expect *unrelated* classs to implement the interface
  * Example: Comparable and Cloneable are implemented by many unrelated classes
* You to specify the behavior of a particular data type, but you are not concerned about who implements its behavior
* You want to separate different behavior
* The Collections API is an excellent example
  * we have used the List interface and implementations ArrayList and LinkedList
* The JDBC API is another example
  * its almost only interfaces
  * "JDBC drivers"
  * enables writing of code independent of the DB vendor
  * learn more later in the course.
