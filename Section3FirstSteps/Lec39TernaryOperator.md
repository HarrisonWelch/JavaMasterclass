# Lec39TernaryOperator

### Code
```java
        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasChar is true");
        }
```
Output
```
wasChar is true
```

## The ternary operator `? :`
```java
int ageOfClient = 20;
boolean isEighteenOrOver = ageClient == 20 ? true : false;
```
* Operand one - `ageOfClient == 20` - is the case we are checking
* Op two - `true` - assign true to `isEighteenOrOver` if condition (op one) is true
* Op three - `false` - assign true to `isEighteenOrOver` if condition (op one) is false
* In this case, ageClient is 20 so the result will isEighteenOrOver will be true
* Good Idea, use parenthesis to indicate the condition
  * `boolean isEighteenOrOver = (ageClient == 20) ? true : false;`












