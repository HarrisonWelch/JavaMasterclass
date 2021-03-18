package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        // Another One
        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        // Notice previousResult and result are independent

        // Another One
        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        // Division
        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        // Modulus Operator
        result = result % 3; // remainder after division of 3. (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        //++
        // result = result + 1
        result++; // Abbr. op. 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        // Same with sub
        // result = result - 1;
        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // +=
        // result = result * 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // *=
        // result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // /=
        // result = result / 3;
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // -=
        // result = result / 3;
        result -= 2; // 10 / 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false; // Assignment op. Assign false to isAlien
//        if (isAlien == true) // == is testing if value is false. Asks if operands are identical.
//            System.out.println("It is not an alien!"); // Not using curly-braces/whitespace
//            System.out.println("And I am scared of aliens");
        if (isAlien == false) { // == is testing if value is false. Asks if operands are identical.
            System.out.println("It is not an alien!"); // Not using curly-braces/whitespace
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore == 100) {
            System.out.println("You got the high score! 1");
        }
        if (topScore != 100) {
            System.out.println("You got the high score! 2");
        }
        if (topScore > 100) {
            System.out.println("You got the high score! 3");
        }
        if (topScore >= 100) {
            System.out.println("You got the high score! 4");
        }
        if (topScore < 100) {
            System.out.println("You got the high score! 5");
        }
        if (topScore <= 100) {
            System.out.println("You got the high score! 6");
        }

//        int secondTopScore = 60;
//        if (topScore > secondTopScore && topScore < 100) { // logical AND
//            System.out.println("Greater than secound top score and less than 100");
//        }
//
//        if ((topScore > secondTopScore) || topScore < 100) { // logical AND
//            System.out.println("Greater than secound top score or less than 100");
//        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)) { // logical AND
            System.out.println("Greater than secound top score and less than 100");
        }

        if ((topScore > 90) || secondTopScore <= 90) { // left is false right is true
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error");
        }

        boolean isCar = false;
        if (!isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wasChar is true");
        }

    }
}
