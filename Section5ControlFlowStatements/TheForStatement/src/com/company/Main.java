package com.company;

public class Main {

    public static void main(String[] args) {
        // The For Statement
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
        // It gets tedious to type this out

        for (int i = 0; i < 6; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        // using the for statement, call the calculateInterest method
        // the amount of 1000 with interest rates 2 through 8
        // and print the results to the console window

        for (int i = 2; i < 9; i++) {
            // Note: i only exists inside here
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }

        // How would you modify the for loop above to do the same thing as shown above
        // but start with 8 and work backwards to 2
        System.out.println("----");
        for (int i = 8; i >= 2; i--) {
            // Note: i only exists inside here
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
        }

        // Final Challenge
        // Create a for statment with any range of number
        // determine if the number is prime
        // print an indicator of how many prime you have found
        // exit loop if you have found 3 primes
        // hint: use break to exit a loop
        int numPrimes = 0;
        for (int i = 5; i < 100; i++) {
            if (isPrime(i)){
                System.out.println("isPrime("+i+") = " + isPrime(i));
                numPrimes++;
            }
            if (numPrimes > 3) {
                break;
            }
        }
//        int count = 0;
//        for (int i = 10; i < 50; i++) {
//            if (isPrime(i)){
//                count++;
//                System.out.println("Number "+i+" is a prime number");
//                if (count == 3) {
//                    break;
//                }
//            }
//        }
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for(int i = 2; i <= (long) Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
