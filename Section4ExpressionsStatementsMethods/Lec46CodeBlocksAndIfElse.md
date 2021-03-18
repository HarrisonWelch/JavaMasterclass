# Lec46CodeBlocksAndIfElse

## Code Blocks
* The curly braces are an in statement condition
* This fails

```java
        if (score == 4000)
            System.out.println("Your score was 5000");
            System.out.println("This was excuted");
```
output
```
This was excuted
```

### Explain
* w/o curly braces the if will only limit or control up to the single statement after the if condition parenthesis. Thus we see the 2nd sys out statement execute.

### Fix
```java
        if (score == 4000) {
            System.out.println("Your score was 5000");
            System.out.println("This was excuted");
        }
```

### Notes
* Even if you use a single line it's best to use the curly braces. Consistency + legibility

## If-Else
```java
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 5000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000) {
            System.out.println("Your score was less than 5000");
        } else {
            System.out.println("Got here");
        }
    }
```
ouput
```
Got here
```
### Explain
* `score` is not less than 5000 so the else executes.
* Making `score < 5000` say `score <= 5000` instead will allow the 1st code block to execute

## If-Else

```java
    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 4000;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }
    }
```

### Explain
* The `else if ...` tests again if the first one was false
* The `else` executes after all others are false

## Definitions inside code blocks
* Variable names declared (and initialized) inside a codeblock cannot be used outside
  * The reverse is possible
  * Accessing ***from*** inside inner scopes ***to*** outer works, but outwards does not
* This fails

```java
        if (gameOver == true) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println();
        }

        int savedFinalScore = finalScore;
```

### Explain
* finalScore is declared inside the `{}` codeblock. This cannot be accessed past the end of its scope/codeblock

## Challenge Time
Print out a 2nd score on the screen with the following

1. Score set to 10000
2. levelCompleted set 8
3. Bonus set to 200
4. But make sure the 1st printout above still displays as well

### My answer
```java
        score = 10000;
        levelCompleted = 8;
        bonus = 200;

        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was = " + finalScore);
        }
```
output: `Your final score was = 11600`

### Professor answer

Option 1
* Create new vars
  * Minor Problem: Using excess memory

```
        boolean newGameOver = true;
        int newScore = 10000;
        int newLevelCompleted = 8;
        int newBonus = 200;

        if (newGameOver) {
            int finalScore = newScore + (newLevelCompleted * newBonus);
            System.out.println("Your final score was = " + finalScore);
        }
```
output: `Your final score was = 11600`

Option 2
* Use old vars
  * Minor Problem: Dont have record of the old record
  * Minor Problem: duplicating code. Makes changes hard.
    * You can remove this by using methods
* Code is essentially the same as the above.

