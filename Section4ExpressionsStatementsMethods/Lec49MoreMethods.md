# Lec49MoreMethods

## More on Methods
* return an int and log it to the console


## Challenge
* Create a method called displayHighScorePosition
  * It should receive a players name and a 2nd param as a position in the high score table
  * Display the player name with a message like " managed to get into position " and the position they got and a further message " on the high score table".
* Create a 2nd method called calculateHighScorePosition
  * It should be sent one argument only, the player score
  * It return an int
  * the return data should be
    * `1` if the score is >1000
    * `2` if the score is >500 and <1000
    * `3` if the score is >100 and <500
    * `4` if the score is >100 and <500
  * Call both methods and display the results of the following
    * A score of 1500, 900, 400, and 50
* Note: a void method is often called a procedure
* Note: a method can also be called a function. Interchangeable

## My Answer

```java
package com.company;

public class Main {

    public static void main(String[] args) {
        displayHighScorePosition("Mary", calculateHighScorePosition(1500));
        displayHighScorePosition("Rashad", calculateHighScorePosition(900));
        displayHighScorePosition("Z", calculateHighScorePosition(400));
        displayHighScorePosition("Xylophone", calculateHighScorePosition(50));
    }

    public static void displayHighScorePosition(String playerName, int postionHighScoreTable) {
        System.out.println(playerName + " managed to get into position " + postionHighScoreTable + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore > 1000) {
            return 1;
        } else if (playerScore > 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore > 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}
```
ouput
```
Mary managed to get into position 1 on the high score table
Rashad managed to get into position 2 on the high score table
Z managed to get into position 3 on the high score table
Xylophone managed to get into position 4 on the high score table
```

## Slight problem
* We are using `<` and `>` so that it does not include the numbers 1000, 500, and 100.
* To fix this we need only introduce `>=` and `<=` where applicable

## Fixed
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        displayHighScorePosition("Mary", calculateHighScorePosition(1500));
        displayHighScorePosition("Rashad", calculateHighScorePosition(900));
        displayHighScorePosition("Z", calculateHighScorePosition(400));
        displayHighScorePosition("Xylophone", calculateHighScorePosition(50));
        displayHighScorePosition("Louise", calculateHighScorePosition(1000));
        displayHighScorePosition("Marshall", calculateHighScorePosition(500));
        displayHighScorePosition("Crystal", calculateHighScorePosition(100));
    }

    public static void displayHighScorePosition(String playerName, int postionHighScoreTable) {
        System.out.println(playerName + " managed to get into position " + postionHighScoreTable + " on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

}
```
output
```
Mary managed to get into position 1 on the high score table
Rashad managed to get into position 2 on the high score table
Z managed to get into position 3 on the high score table
Xylophone managed to get into position 4 on the high score table
Louise managed to get into position 1 on the high score table
Marshall managed to get into position 2 on the high score table
Crystal managed to get into position 3 on the high score table
```

# Future Optimizations
* In an `if else` statement, we have knowledge in `else if` blocks that the previous `if` condition was false. So `...else if (playerScore >= 500 && playerScore < 1000)...` can be truncated to just `else if (playerScore >= 500)`.

