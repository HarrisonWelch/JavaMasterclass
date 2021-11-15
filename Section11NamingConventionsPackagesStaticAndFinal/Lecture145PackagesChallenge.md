# Lecture 145 Packages Challenge

## Challenge Desc
* Create a suitably named package containing a class called Series with the following static methods:
  * nSum(int n) returns the sum of all numbers from 0 to n. 
    * 0,1,3,6,10,15,21,28,...
  * factorial(int n) returns the product of all number from 1 to n
    * i.e. 1 * 2 * 3 ... * (n - 1) * n.
    * The first 10 are:
      * 0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800
  * fibonacci(n) returns the nth Fibonacci number. These are defined as:
    * f(0) = 0
    * f(1) = 1
    * f(n) = f(n-1) + f(n-2)
    * so f(2) is also 1. The first 10 fib numbers are:
      * 0,1,1,2,3,5,8,13,21,34,55.
  * When you have your functions, delete the Main class and produce a jar file
  * Create a new project and add your Series library, then test the 3 methods in the main() method of your new project

Series.java

```java
package com.challenge.lib;

public class Series {
    public static int nSum(int n){
        if (n < 0) return -1;

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += i;
        }

        return sum;
    }
    public static int factorial(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;

        int prod = 1;

        for (int i = 1; i < (n+1); i++) {
            prod *= i;
        }

        return prod;

    }
    public static int fibonacci(int n) {
        if (n < 0) return -1;
        if (n == 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 1;

        int a = 1;
        int b = 1;
        int i = 0;

        for(; i < (n-1); i++) {
            if (i % 2 == 0) {
                a = a + b;
            } else {
                b = a + b;
            }
        }

        return (i % 2) == 0 ? a : b;
    }
}
```

Main.java

```java
package com.example.packageschallenge;

import com.challenge.lib.Series;

public class Main {

    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.print(Series.nSum(i) + ", ");
        }
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.print(Series.factorial(i) + ", ");
        }
        System.out.println();
        for (int i = 0; i <= 10; i++) {
            System.out.print(Series.fibonacci(i) + ", ");
        }
    }
}
```


