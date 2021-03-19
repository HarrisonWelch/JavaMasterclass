# Lec54CodingExercises

## Coding Exercises
* New Feature added in 2018
* Coding problems are presented and the user can input their solution interactively

# Example
* Design a method called checkNumber with one param number as an int. if the number is > 0 return "positive", if the number is < 0 return "negative", if 0 return "zero"

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("checkNumber(42) = " + checkNumber(42));
        System.out.println("checkNumber(0) = " + checkNumber(0));
        System.out.println("checkNumber(-1) = " + checkNumber(-1));
    }

    public static String checkNumber(int number){
        if (number == 0){
            return "zero";
        } else if (number > 0) {
            return "positive";
        }
        return "negative";
    }
}
```

## Notes
* Coding exercises need to be EXACT (very picky)
  * Capitalization
  * Static vs Non-static
  * single method vs. > 1 method
