# Lec31CharAndBoolean

## Char
* Similar to string
* But only store one character
* Why use a character var?
  * Last key press by the user
  * Menu option
  * Used more in the past with less memory
* Width of 16 because it can use unicode

## Unicode 
* Where every symbol is given a different value
* English value is 26 characters
* Can be 65535 characters
* Java can use it by doing `char myUnicodeChar = '\u0044';`

Example
```java
package com.company;

public class Main {

    public static void main(String[] args) {

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println("myChar = " + myChar);
        System.out.println("myUnicodeChar = " + myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println("myCopyrightChar = " + myCopyrightChar);
    }
}
```
Output
```
myChar = D
myUnicodeChar = D
myCopyrightChar = ©
```


