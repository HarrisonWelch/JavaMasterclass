package com.company;

public class Main {

    public static void main(String[] args) {
        // While And Do While
        int count = 1;
        while (count != 5) {
            System.out.println("Count value is " + count);
            count++;
        }

        // equivalent for loop
        for(int i = 1; i != 5; i++) {
            System.out.println("i value is " + i);
        }

        // you can can also use a break if a condition is met
        count = 1;
        while(true) {
            if (count == 5){
                break;
            }
            System.out.println("Count value is " + count);
            count++;
        }

        // Note: it is important that the count is increment,
        // else the loop exit condition is never met and the loop will continue indefinitely

        // Note: if the start condition is already met when
        // the while loop condition is tested it will never execute

        // Now for Do While loops

        count = 1;
        do {
            System.out.println("Count value was " + count);
            count++;
        } while (count != 6); // Note the semicolon here

        // do while is always execute at least once.

        int number = 4;
        int finishNumber = 20;
        int countEven = 0;
        while (number <= finishNumber) {
            number++;
            if(!isEvenNumber(number)) {
                continue; // go to next iteration of loop (condition is tested again)
            }
            countEven++;
            System.out.println("Even number " + number);
            if (countEven >= 5) {
                System.out.println("Total number of even numbers found " + countEven);
                break;
            }
        }
    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
