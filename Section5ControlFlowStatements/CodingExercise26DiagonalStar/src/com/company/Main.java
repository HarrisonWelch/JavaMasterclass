package com.company;

public class Main {

    public static void main(String[] args) {
	    // CodingExercise26DiagonalStar
        printSquareStar(5);
        System.out.println("--------------------------------");
        printSquareStar(8);
        System.out.println("--------------------------------");
        printSquareStar(12);
    }

    public static void printSquareStar(int number){
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
        for (int row = 1; row < number-1; row++) {
            System.out.print("*");
            for (int col = 1; col < number-1; col++) {
                if (row == col || number-row-1 == col) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
}
