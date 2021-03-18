# Lec35IfThenStatement

## Overview
* `==` Compares for equality
* If you don't use curly braces after an if statement, only the next expression/statement is executed.
* Use Curly braces in general

## Code

```java
        boolean isAlien = false; // Assignment op. Assign false to isAlien
//        if (isAlien == true) // == is testing if value is false. Asks if operands are identical.
//            System.out.println("It is not an alien!"); // Not using curly-braces/whitespace
//            System.out.println("And I am scared of aliens");
        if (isAlien == false) { // == is testing if value is false. Asks if operands are identical.
            System.out.println("It is not an alien!"); // Not using curly-braces/whitespace
            System.out.println("And I am scared of aliens");
        }
```
Output
```
It is not an alien!
And I am scared of aliens
```


