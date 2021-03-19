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
        int position = 4;
        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500){
            position = 2;
        } else if (playerScore >= 100) { // <-- Introduced an error
            position = 3;
        }
        return position;
    }

}
