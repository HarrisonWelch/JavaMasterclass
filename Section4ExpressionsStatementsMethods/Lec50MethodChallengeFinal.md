# Lec50MethodChallengeFinal

## Final Changes
* In an `if else` statement, we have knowledge in `else if` blocks that the previous `if` condition was false. So `...else if (playerScore >= 500 && playerScore < 1000)...` can be truncated to just `else if (playerScore >= 500)`.
* Then the `else` can be subbed for a simple return 4 as we have tested all other conditons as needed

## Changed Function
```java
    public static int calculateHighScorePosition(int playerScore){
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500) {
            return 2;
        } else if (playerScore >= 100) {
            return 3;
        }
        return 4;
    }
```
output is the same

## More than 1 way to solve this
```java
    public static int calculateHighScorePosition(int playerScore){
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
        } else if (playerScore >= 100){
            position = 3;
        }
        return position;
    }
```
output is the same