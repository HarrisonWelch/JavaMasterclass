package com.company;

public class Main {

    public static void main(String[] args) {
        // Sum 3 And 5 Challenge
        int sum = 0;
        int count = 0;
        for (int i = 1; i <= 1000; i++){
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Found Number = " + i);
                sum += i;
                count++;
                if (count == 5) {
                    break;
                }
            }
        }
        System.out.println("Sum = " + sum);
    }
}
