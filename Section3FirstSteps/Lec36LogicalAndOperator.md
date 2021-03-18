# Lec36LogicalAndOperator

## Overview
* Relational Operators
  * `==` - is equal to
  * `!=` - is not equal to
  * `>` - greater than
  * `>=` - greater or equal to than
  * `<` - less than
  * `<=` - less than or equal to

## Logicial Operator AND
* `&&` - AND. Return true if both the left and right operands are true, else return false.

## Code

```java
        int topScore = 80;
        if (topScore == 100) {
            System.out.println("You got the high score! 1");
        }
        if (topScore != 100) {
            System.out.println("You got the high score! 2");
        }
        if (topScore > 100) {
            System.out.println("You got the high score! 3");
        }
        if (topScore >= 100) {
            System.out.println("You got the high score! 4");
        }
        if (topScore < 100) {
            System.out.println("You got the high score! 5");
        }
        if (topScore <= 100) {
            System.out.println("You got the high score! 6");
        }

        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100) { // logical AND
            System.out.println("Greater than secound top score and less than 100");
```

Output

```
You got the high score! 2
You got the high score! 5
You got the high score! 6
Greater than secound top score and less than 100
```

## Other
* DO NOT USE `&`. That's bitwise AND and will be covered at a later time.
