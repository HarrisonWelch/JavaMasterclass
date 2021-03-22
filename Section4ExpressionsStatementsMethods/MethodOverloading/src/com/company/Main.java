package com.company;

public class Main {

    public static void main(String[] args) {
//        double newScore = calculateScore("Tim", 500.00d);
//        System.out.println("New score is " + newScore);
//        calculateScore();
//        calculateScore("Hello", 1.2);

        System.out.println("calcFeetAndInchesToCentimeters(4,5) = " + calcFeetAndInchesToCentimeters(4,5));
        System.out.println("calcFeetAndInchesToCentimeters(3,16) = " + calcFeetAndInchesToCentimeters(3,16));
        System.out.println("calcFeetAndInchesToCentimeters(-1,11) = " + calcFeetAndInchesToCentimeters(-1,11));
        System.out.println("calcFeetAndInchesToCentimeters(16) = " + calcFeetAndInchesToCentimeters(16));
        System.out.println("calcFeetAndInchesToCentimeters(1000) = " + calcFeetAndInchesToCentimeters(1000));
        System.out.println("calcFeetAndInchesToCentimeters(-12) = " + calcFeetAndInchesToCentimeters(-12));
    }

    public static int calculateScore(String playername, int score){
        System.out.println("Player " + playername + " scored " + score + " points.");
        return score * 1000;
    }

    public static double calculateScore(String playername, double score){
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

    public static int sumTwoNumbers(int a, int b){
        return a + b;
    }
    public static int sumThreeNumbers(int a, int b, int c){
        return a + b + c;
    }
    public static int sumFourNumbers(int a, int b, int c, int d){
        return a + b + c + d;
    }


    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }

}
