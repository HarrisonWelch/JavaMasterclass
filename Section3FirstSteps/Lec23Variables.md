# Variables

* In order to do useful things we need variables.
* What are variables?
  * way to store info
  * define by program
  * can be accessed
  * computer decides how to store them
  * contents can adjusted
  * Define
    * data type
    * name
    * value

## Data types
* int - integer, whole number, no decimal

## Declaration statement
* Define variable by data type, name, and option set of value
```java
int myFirstNumber = 5;
```
* Initialization (to give value `= 5`) is optional
* In general, variables have to be initialized before being used

## Expression
* Construct that evalutes to a single value
* More on this later

## Back to code
* `myFirstNumber` is initialized to 5
* We don't care about memory location, Java does all the dirty work

## Challenge
* Print out the variable `myFirstNumber`
* Done

```java
public class Hello {

    public static void main(String [] args){
        System.out.println("Hello Harrison");

        int myFirstNumber = 5;

        System.out.println(myFirstNumber);
    }
}
```

* Mistake mentioned
  * `System.out.println("myFirstNumber");` uses the string literal and not the variable
  * We told it to print the text and not to access the memory location and get the value from it

## The expression can be more complex
* Lets add an expression for the sum of two numbers

```java
public class Hello {

    public static void main(String [] args){
        System.out.println("Hello Harrison");

        int myFirstNumber = 10 + 5;

        System.out.println(myFirstNumber);
    }
}
```
* Java has looked at the expression and calculated the value to be 15
* Now something more complicated

```java
public class Hello {

    public static void main(String [] args){
        System.out.println("Hello Harrison");

        int myFirstNumber = (10 + 5) + (2 * 10);

        System.out.println(myFirstNumber);
    }
}
```

## Java Operators
* +,-,*,/ are common math operators that most are familiar with



