# Lec 69 While And Do While Recap

## While loop format
* Condition checked at the start
* Multiple statements can go inside
```java
while(condition) {
    // statements
}
```

## Do While loop format
* Executes at least once
* Condition checked at the end
* Multiple statements can go inside
```java
do {
    // statements
} while (condition); // semicolon required
```

## While vs For loops
* These do the same thing

```java
int i = 0
while(i <= 5) {
    System.out.println("i = " + i);
    i++;
}
```
vs
```java
for(int i = 0; i <= 5; i++) {
    System.out.println("i = " + i);
}
```

## `break` and `continue`
* `break` exits the loop
* `continue` goes to the next iteration of the loop
  * Goes to the end curly brace
  * All checks still happen

## Other
* Be careful of your conditions else you'll create an infinite loop or a loop that never executes
