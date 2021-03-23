# Lec 68 The While And Do While Statement

## While Statement
* When you don't know how many times you're going to repeat a process

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // While And Do While
        int count = 1;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        // equivalent for loop
        for(int i = 1; i != 5; i++) {
            System.out.println("i value is " + i);
        }

        // you can can also use a break if a condition is met
        count = 1;
        while(true) {
            if (count == 5){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        // Note: it is important that the count is increment,
        // else the loop exit condition is never met and the loop will continue indefinitely

        // Note: if the start condition is already met when
        // the while loop condition is tested it will never execute

        // Now for Do While loops

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6); // Note the semicolon here

        // do while is always execute at least once.
    }
}
```

## Challenge
* Create a method call isEvenNumber that takes an int and return a bool if it is even or not

### Solution

```java
public static boolean isEvenNumber(int number){
    return number % 2 == 0;
}
```

Now we use it in the java program

```java
int number = 4;
int finishNumber = 20;
while (number <= finishNumber) {
    number++;
    if(!isEvenNumber(number)) {
        continue; // go to next iteration of loop (condition is tested again)
    }
    System.out.println("Even number " + number);
}
```
output
```
Even number 6
Even number 8
Even number 10
Even number 12
Even number 14
Even number 16
Even number 18
Even number 20
```

## Challenge 2
* Modify the while code above
* Make it also record the total number of even numbers it has found
* and break once 5 are found
* and at the end, display the total number of even numbers found

### Solution

```java
int number = 4;
int finishNumber = 20;
int countEven = 0;
while (number <= finishNumber) {
    number++;
    if(!isEvenNumber(number)) {
        continue; // go to next iteration of loop (condition is tested again)
    }
    countEven++;
    System.out.println("Even number " + number);
    if (countEven >= 5) {
        System.out.println("Total number of even numbers found = " + countEven);
        break;
    }
}
```
output
```
Even number 6
Even number 8
Even number 10
Even number 12
Even number 14
Total number of even numbers found = 5
```