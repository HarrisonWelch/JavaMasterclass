# Coding Exercise 15 Number Palindrome

## Solution
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // CodingExercise15NumberPalindrome
        System.out.println("isPalindrome(1221) = " + isPalindrome(1221));
        System.out.println("isPalindrome(-1221) = " + isPalindrome(-1221));
        System.out.println("isPalindrome(1234) = " + isPalindrome(1234));
        System.out.println("isPalindrome(707) = " + isPalindrome(707));
        System.out.println("isPalindrome(11212) = " + isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        number = Math.abs(number);
        int reverse = 0;
        int place = (int) Math.pow(10, (number + "").length()-1);
        int n = number;
        while (n > 0) {
            reverse += (n % 10) * place;
            place = place / 10;
            n /= 10;
        }
        return number == reverse;
    }
}
```
output
```
isPalindrome(1221) = true
isPalindrome(-1221) = true
isPalindrome(1234) = false
isPalindrome(707) = true
isPalindrome(11212) = false
```




