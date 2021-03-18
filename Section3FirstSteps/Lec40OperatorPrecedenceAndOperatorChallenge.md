# Lec40OperatorPrecedenceAndOperatorChallenge

## Useful links
* Check out oracle's ops summary page
  * https://docs.oracle.com/javase/tutorial/java/nutsandbolts/opsummary.html
* Check out this precedence table from Bilkent University, Turkey
  * http://www.cs.bilkent.edu.tr/~guvenir/courses/CS101/op_precedence.html

## Operator Challenge
1. Create double var with value of 20.00
2. Create a 2nd version of type double with the value of 80.00
3. Add both numbers together and multiply by 100.00
4. Use remainder to figure the remainder from the result in step 3 and 40
   1. `%` can be used on double
5. Create a boolean variable that assigns the value true if the remainder in #4 is 0 or false if its not zero
6. Output the boolean var
7. Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true.

## Code
```java
package com.company;

public class Main {

    public static void main(String[] args) {

        // Create double var with value of 20.00
        double dVar = 20;

        // Create a 2nd version of type double with the value of 80.00
        double dVar2 = 80;

        // Add both numbers together and multiply by 100.00
        double addBoth = (dVar + dVar2) * 100.00;

        // Use remainder to figure the remainder from the result in step 3 and 40
        double remainder = addBoth % 40.00;

        // Create a boolean variable that assigns the value true if the remainder in #4 is 0 or false if its not zero
        boolean isZero = (remainder == 0) ? true : false;

        // Output the boolean var
        System.out.println(isZero);

        // Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true.
        if (!isZero){
            System.out.println("Got some remainder");
        }
        
    }
}
```
Output
```
true
```

## Instructor's Incorrect Solution (with my var names)

```java
package com.company;

public class Main {

    public static void main(String[] args) {

        // Create double var with value of 20.00
        double dVar = 20;

        // Create a 2nd version of type double with the value of 80.00
        double dVar2 = 80;

        // Add both numbers together and multiply by 100.00
        double addBoth = dVar + dVar2 * 100.00;

        System.out.println("addBoth = " + addBoth);

        // Use remainder to figure the remainder from the result in step 3 and 40
        double remainder = addBoth % 40.00;

        System.out.println("remainder = " + remainder);

        // Create a boolean variable that assigns the value true if the remainder in #4 is 0 or false if its not zero
        boolean isZero = (remainder == 0) ? true : false;

        System.out.println("isZero = " + isZero);

        // Output the boolean var
        System.out.println(isZero);

        // Write an if-then statement that displays a message "Got some remainder" if the boolean in step 5 is not true.
        if (!isZero){
            System.out.println("Got some remainder");
        }

    }
}

```
Output
```
addBoth = 8020.0
remainder = 20.0
isZero = false
false
Got some remainder
```

## Explanation
* `double addBoth = dVar + dVar2 * 100.00;` Multiplies before it adds b/c precedence
* Switch to `double addBoth = (dVar + dVar2) * 100.00;`

