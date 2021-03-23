# Lec 70 Digit Sum Challenge

* Write a method with the name sumDigits that has one int parameter called number.
* If a param is >= 10 then the method should process the number and return sum of all digits
  * else return -1
* The numbers from 0-9 have 1 digit so we don't want to process them, also we dont want to process negative numbers so return -1 for negative numbers

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("sumDigits(125) = " + sumDigits(125));
        System.out.println("sumDigits(-1) = " + sumDigits(-1));
        System.out.println("sumDigits(9) = " + sumDigits(9));
        System.out.println("sumDigits(8675309) = " + sumDigits(8675309));
        System.out.println("sumDigits(12) = " + sumDigits(12));
    }
    public static int sumDigits(int number) {
        if (number < 10) return -1;

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }
}
```

