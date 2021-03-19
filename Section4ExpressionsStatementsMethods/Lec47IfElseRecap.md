# Lec47IfElseRecap

## Recap
* an `if` statement will let a code block exe on a specific condition
* A code block can have one or more than one statement inside.
* `else` will allow a specific code block to run if the condition is false
* `else if` will allow testing of multiple conditions

## Basic Structure

```java
if (condition) {
    // if statement (block)
} else {
    // else statement (block)
}
```

## Example 1
```java
int score = 6000;

if (score >= 5000) { // Java will set this as true
    System.out.println("Your score was >= 5000"); // and exe this line
} else if (score < 1000 && score >= 500) {
    System.out.println("Your score was < 1000 but >= 500");
} else {
    System.out.println("Your score was < 500");
}
// then exit
```
output: `Your score was >= 5000`


## Example 2
```java
int score = 800;

if (score >= 5000) { // Java will see this as false
    System.out.println("Your score was >= 5000"); 
} else if (score < 1000 && score >= 500) { // Java will see this as true. score is between 1000 and 500 (lower inclusive)
    System.out.println("Your score was < 1000 but >= 500"); // and exe this line
} else {
    System.out.println("Your score was < 500");
}
// then exit
```
output: `Your score was < 1000 but >= 500`

## Example 2
```java
int score = 200;

if (score >= 5000) { // Java will see this as false
    System.out.println("Your score was >= 5000"); 
} else if (score < 1000 && score >= 500) { // Java will see this as false
    System.out.println("Your score was < 1000 but >= 500"); // and exe this line
} else { // default is exe
    System.out.println("Your score was < 500"); // and exe this line
}
// then exit
```
output: `Your score was < 500`

