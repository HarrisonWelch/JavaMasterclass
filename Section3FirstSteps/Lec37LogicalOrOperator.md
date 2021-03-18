# Lec37LogicalOrOperator

This follows Lec36 file

## Logical Operator OR
* `||` - OR. Return true if one of the left and right operands are true, else return false (implies both are false).
* DO NOT use a sinle bar/pipe char `|`. This is a bitwise OR; totally different

## Bitwise vs Logial Operators
* `&` - bitwise AND
* `&&` - logical AND
* `|` - bitwise OR
* `||` - logical OR

## Code
```java
        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) { // logical AND
            System.out.println("Greater than secound top score and less than 100");
        }

        if ((topScore > 90) || secondTopScore <= 90) { // left is false right is true
            System.out.println("Either or both of the conditions are true");
        }
```
## Output
```
Either or both of the conditions are true
```