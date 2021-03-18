# Lec45StatementsWhitespaceIndentation

## Statements
* A semicolon `;` indictates the end of a statement

```java
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
```
output
```
This is a test
This is another still more.
This is another one
```

## Whitespace
* Space between

This is valid
```java
        //whitespace
        int
                x
                    =
            17;
```
Java will cut the whitespace

## Indentation
* Generally we indent when going inside of:
  * if statements
  * class definitions
  * method definitions

This is hard to read
```java
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
}
}
```

As opposed to this

```java
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
```

