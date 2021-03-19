# Lec48MethodsInJava

## Methods
* We have been using method "main" all along

### Define `calculateScore`
```java
    public static void calculateScore() {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was = " + finalScore);
        }

    }
```

## Passing information to a method
* Tell the method what parameters/information
* We can add parameters with to the functions parenthesis
* Then pass them in the main method

```java
public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore(true, 800, levelCompleted, bonus);

        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was = " + finalScore);
        }
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // We no longer need the variables in here

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score was = " + finalScore);
        }

    }

}

```
ouput 
```
Your final score was = 2300
Your final score was = 11600
```
Same as before

## Cleaning further
* Change the 2nd score calculation to be arguments passed into the function
* Note: we changed the bonus to 2000

```java
    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200); // Notice typing in the variables in directly
    }

    public static void calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // We no longer need the variables in here
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was = " + finalScore);
        }
    }
```

output
```
Your final score was = 3300
Your final score was = 13600
```

* Now we have two lines and the code looks cleaner

## Now send back the result
* Get the two of them to work together
* `void` means don't send anything back
* Lets return the `finalScore` instead
* Note: `-1` is commonly used to indicate value not found. Especially in cases where the value cannot be positive or null

## Full Code as of now
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        calculateScore(true, 800, 5, 100);
        calculateScore(true, 10000, 8, 200); // Notice typing in the variables in directly
    }

    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus) {
        // We no longer need the variables in here
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 2000;
            System.out.println("Your final score was = " + finalScore);
            return finalScore;
        }
        return -1;
    }
}
```
