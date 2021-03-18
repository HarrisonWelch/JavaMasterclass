# Lec33OperatorsOperandsAndExpressions

## Operators
* Symbols that preform specific operation on 1,2, or more operands
* `+` - Add
* `-` - Subtract
* `*` - 
* `\`
* `%`

## Operand
* Object manipulated by an operator
* Example x = y + z
  * x, y, and z are operands and + is the operator

## Expression
* Formed by combining variables, literals, method return values
* Example `myInt = 15 + 12;`
  * Return is 27
* Example `doubleSalary = salary * 2;`
  * doubleSalary and salary are variables. And Operands
  * 2 is a number literal
  * `*` is an oparator

## Comments
* Ignored by program/compiler
* After ``//`` is ignored

## Code

```java
package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        // Another One
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        // Notice previousResult and result are independent

        // Another One
        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        // Division
        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        // Modulus Operator
        result = result % 3; // remainder after division of 3. (4 % 3) = 1
        System.out.println("4 % 3 = " + result);


    }
}
```
Output
```
1 + 2 = 3
previousResult = 3
3 - 1 = 2
2 * 10 = 20
20 / 5 = 4
4 % 3 = 1
```























