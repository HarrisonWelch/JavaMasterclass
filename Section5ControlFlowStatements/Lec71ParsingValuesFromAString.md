# Lec71ParsingValuesFromAString

## String Parsing
* Later this will be useful with user input on the scanner class
* If the number is unable to parse it will throw a NumberFormatException

### Example
```java
public static void main(String[] args) {
    // write your code here
    String numberAsString = "2018";
    System.out.println("numberAsString = " + numberAsString);

    int number = Integer.parseInt(numberAsString);
    System.out.println("number = " + number);

    numberAsString += 1; // Concatenation
    number += 1; // Addition
    System.out.println("numberAsString = " + numberAsString);
    System.out.println("number = " + number);
}
```

This also works with double

```java
public static void main(String[] args) {
    // write your code here
    String numberAsString = "2018.125";
    System.out.println("numberAsString = " + numberAsString);

    double number = Double.parseDouble(numberAsString);
    System.out.println("number = " + number);

    numberAsString += 1; // Concatenation
    number += 1; // Addition
    System.out.println("numberAsString = " + numberAsString);
    System.out.println("number = " + number);
}
```



