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
