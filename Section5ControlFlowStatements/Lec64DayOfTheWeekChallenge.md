# Lec 64 Day Of The Week Challenge

## Challenge
* Write a method with the name printDayOfTheWeek that has one parameter of type int and name it day.
* Should not return any value, void
* Using a switch statement
  * print the day of the week Sunday, Monday, ... Sunday if the day is 0 to 6.
  * default should be "Invalid day"
* Bonus
  * Write a 2nd solution using if then else, instead of using switch
  * Create a new proj with name DayOfTheWeekChallenge

## Solution

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        printDayOfTheWeek(-1);
        // For loop for testing
        for(int i = 0; i <= 6; i++){
            printDayOfTheWeek(i);
        }
        printDayOfTheWeek(7);
        // Spacer
        System.out.println("----");
        printDayOfTheWeekIfElse(-1);
        // For loop for testing
        for(int i = 0; i <= 6; i++){
            printDayOfTheWeekIfElse(i);
        }
        printDayOfTheWeek(7);
    }

    public static void printDayOfTheWeek(int day){
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }

    public static void printDayOfTheWeekIfElse(int day){
        if (day == 0){
            System.out.println("Sunday");
        } else if (day == 1){
            System.out.println("Monday");
        } else if (day == 2){
            System.out.println("Tuesday");
        } else if (day == 3){
            System.out.println("Wednesday");
        } else if (day == 4){
            System.out.println("Thursday");
        } else if (day == 5){
            System.out.println("Friday");
        } else if (day == 6){
            System.out.println("Saturday");
        } else {
            System.out.println("Invalid day");
        }
    }

}
```
Output
```
Invalid day
Sunday
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday
Invalid day
----
Invalid day
Sunday
Monday
Tuesday
Wednesday
Thursday
Friday
Saturday
Invalid day

Process finished with exit code 0

```
