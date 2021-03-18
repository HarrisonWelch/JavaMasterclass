package com.company;

public class Main {

    public static void main(String[] args) {
        //int int=5; // does not work as int is a keyword
        int int2 = 5; // works
        // false, true, and null also are not valid variable names

        // a mile is equal to 1.609344
        double kilometres = (100 * 1.609344);

        int highScore = 50;
        if (highScore == 50) {
            System.out.println("This is an expression");
        }

        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score!");
            score = 0;
        }

    }
}
