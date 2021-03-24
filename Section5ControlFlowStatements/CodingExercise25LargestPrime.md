# Coding Exercise 25 Largest Prime

## Summary
* Return the largest prime number that is composite to the number passed in
* If the number is negative return -1
* If the number is 1 return -1

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // CodingExercise25LargestPrime
        System.out.println("getLargestPrime(21) = " + getLargestPrime(21));
        System.out.println("getLargestPrime(217) = " + getLargestPrime(217));
        System.out.println("getLargestPrime(0) = " + getLargestPrime(0));
        System.out.println("getLargestPrime(45) = " + getLargestPrime(45));
        System.out.println("getLargestPrime(-1) = " + getLargestPrime(-1));
        System.out.println("getLargestPrime(7) = " + getLargestPrime(7));
        System.out.println("getLargestPrime(1) = " + getLargestPrime(1));
    }

    public static int getLargestPrime(int number) {
        if (number < 0) return -1;
        boolean flag_prime = true;
        for (int i = number; i > 0; i--) {
            if (number % i == 0) {
                flag_prime = true;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0){
                        // Not Prime
                        flag_prime = false;
                    }
                }
                if (flag_prime) {
                    if (i == 1) return -1;
                    return i;
                }
            }
        }
        return -1;
    }
}
```
output
```
getLargestPrime(21) = 7
getLargestPrime(217) = 31
getLargestPrime(0) = -1
getLargestPrime(45) = 5
getLargestPrime(-1) = -1
getLargestPrime(7) = 7
getLargestPrime(1) = -1
```
