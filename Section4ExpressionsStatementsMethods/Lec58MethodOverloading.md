# Lec58MethodOverloading

## Method Overloading
* Defining several methods of the same name but with diff arguments (number or type)
* Create a unique method signature
  * Same name
  * Diff arguments (number or type)
* Cannot change return type (without also changing the arguments)

## EXAMPLE

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore();
    }

    public static int calculateScore(String playername, int score){
        System.out.println("Player " + playername + " scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed player scored " + score + " points.");
        return score * 1000;
    }

    public static int calculateScore(){
        System.out.println("Unnamed player scored, no player score.");
        return 0;
    }

}
```

## Challenge
* Create a method called calcFeetAndInchesToCentimeters
  * It needs to have two parameters.
  * feet is the first parameter, inches, is the 2nd parameter
  * You should validate that the first parameter feet is >= 0
  * You should validate that the 2nd parameter inches is >= 0 and <= 12
  * return -1 from the method if either of the above is not true
  * If the parameters are valid, then calculate how many centimeters comprised the feet and inches passed to this method and return that value
* Create a 2nd method of the same name but with only one parameter inches is the parameter
  * validate that it is >= 0
  * return -1 if it is not true
  * But if its valid, then calculate how many feet are in the inches and then
* here is the tricky part
  * call the other overloaded method passing in the correct feet and inches calculated so that it can calculate correctly.
* hints:
  * use double for your number data types is probably a good idea 1 inch = 2.54cm and 1 ft = 12 inches
  * use the link I give
  * Calling the correct overloaded method requires you to use the right number of arguments

## Solution

```java
package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println("calcFeetAndInchesToCentimeters(4,5) = " + calcFeetAndInchesToCentimeters(4,5));
        System.out.println("calcFeetAndInchesToCentimeters(3,16) = " + calcFeetAndInchesToCentimeters(3,16));
        System.out.println("calcFeetAndInchesToCentimeters(-1,11) = " + calcFeetAndInchesToCentimeters(-1,11));
        System.out.println("calcFeetAndInchesToCentimeters(16) = " + calcFeetAndInchesToCentimeters(16));
        System.out.println("calcFeetAndInchesToCentimeters(1000) = " + calcFeetAndInchesToCentimeters(1000));
        System.out.println("calcFeetAndInchesToCentimeters(-12) = " + calcFeetAndInchesToCentimeters(-12));
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if (feet < 0) return -1;
        if (inches < 0 || inches > 12) return -1;
        int totalInches = (feet * 12) + inches;
        return totalInches * 2.54;
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if (inches < 0) return -1;
        int feet = inches / 12;
        int remInches = inches % 12;
        return calcFeetAndInchesToCentimeters(feet, remInches);
    }

}

```
Output
```
calcFeetAndInchesToCentimeters(4,5) = 134.62
calcFeetAndInchesToCentimeters(3,16) = -1.0
calcFeetAndInchesToCentimeters(-1,11) = -1.0
calcFeetAndInchesToCentimeters(16) = 40.64
calcFeetAndInchesToCentimeters(1000) = 2540.0
calcFeetAndInchesToCentimeters(-12) = -1.0
```
