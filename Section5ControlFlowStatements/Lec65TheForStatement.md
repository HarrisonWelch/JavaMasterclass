# Lec 65 The For Statement

## The For loop
* Repitition

## Example of where its useful
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // The For Statement
        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));
        // It gets tedious to type this out
    }

    public static double calculateInterest(double amount, double interestRate) {
        return (amount * (interestRate / 100));
    }
}
```
* It gets tedious to type this out
* We can use a for loop

## Basic Model
```java
for (init; termination; increment) {
    // code stuff
}
```
* `init` - initialize variables
* `termination` - test at the begining of each loop, exit loop if false
* `increment` - modify variables, usually increment the initialized variables in the first part

## For loop example
```java
for (int i = 0; i < 6; i++) {
    System.out.println("Loop " + i + " hello!");
}
```

## Mini Challenge
* using the for statement, call the calculateInterest method
* the amount of 1000 with interest rates 2 through 8
* and print the results to the console window

```java
for (int i = 2; i < 9; i++) {
    // Note: i only exists inside here
    System.out.println("10,000 at " + i + "% interest = " + calculateInterest(10000.0, (double) i));
}
```
output
```
10,000 at 2% interest = 200.0
10,000 at 3% interest = 300.0
10,000 at 4% interest = 400.0
10,000 at 5% interest = 500.0
10,000 at 6% interest = 600.0
10,000 at 7% interest = 700.0000000000001
10,000 at 8% interest = 800.0
```
* The ` 700.0000000000001` is weird
* This can be fixed with `String.format(...)` function

```java
for (int i = 2; i < 9; i++) {
    // Note: i only exists inside here
    System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
}
```
output
```
10,000 at 2% interest = 200.00
10,000 at 3% interest = 300.00
10,000 at 4% interest = 400.00
10,000 at 5% interest = 500.00
10,000 at 6% interest = 600.00
10,000 at 7% interest = 700.00
10,000 at 8% interest = 800.00
```

## Mini Challenge 2
* How would you modify the for loop above to do the same thing as shown above
* but start with 8 and work backwards to 2

```java
System.out.println("----");
for (int i = 8; i >= 2; i--) {
    // Note: i only exists inside here
    System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, (double) i)));
}
```
output
```
----
10,000 at 8% interest = 800.00
10,000 at 7% interest = 700.00
10,000 at 6% interest = 600.00
10,000 at 5% interest = 500.00
10,000 at 4% interest = 400.00
10,000 at 3% interest = 300.00
10,000 at 2% interest = 200.00
```

### quick `isPrime()` definition
```java
public static boolean isPrime(int n) {
    if (n == 1) {
        return false;
    }

    for(int i = 2; i <= n/2; i++) {
        if (n % i == 0) {
            return false;
        }
    }

    return true;
}
```

## Mini Challenge 3
* Final Challenge
* Create a for statment with any range of number
* determine if the number is prime
* print an indicator of how many prime you have found
* exit loop if you have found 3 primes
* hint: use break to exit a loop

## My solution

```java
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
```
output
```
isPrime(5) = true
isPrime(7) = true
isPrime(11) = true
isPrime(13) = true
```

## Instructor solution
```java
        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)){
                count++;
                System.out.println("Number "+i+" is a prime number");
                if (count == 3) {
                    break;
                }
            }
        }
```
output
```
Number 11 is a prime number
Number 13 is a prime number
Number 17 is a prime number
```

## Optimizing `isPrime`
* Replace `n/2` with `(long) Math.sqrt(n)` in the for loop
* Runs faster, less useless comparisons

```java
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
```


