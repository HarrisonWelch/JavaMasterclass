package com.company;

public class Main {

    public static void main(String[] args) {
        int myVariable = 50;
        myVariable++;
        myVariable--;
        System.out.println("This is a test");
        System.out.println("This is" +
                " another" +
                " still more."); // java can handle this no problem.
        // ; is a terminator

        int anotherVariable = 50;myVariable--; // java does not care, but this is not recommended.

        // this can go further
        int anotherVariable2 = 50;myVariable--;System.out.println("This is another one");

        if (true){
            System.out.println("stuff");
        }

    }
}
