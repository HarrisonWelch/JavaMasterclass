# Lec59MethodOverloadingRecap

## Method Overloading
* A feature that allows more than one method with the same name so long as we use different parameters (number and type)
* Allows diff implementations with different types or number of variables
* You can also mix in other implementations for easier flow

## Example
* Suppose you have a method that can do 
  * the sum of 2 numbers
  * the sum of 3 numbers
  * And the sum of 4 numbers
* Each method would have the number of args passed to it.

Bad Practice
```java
    public static int sumTwoNumbers(int a, int b){
        return a + b;
    }
    public static int sumThreeNumbers(int a, int b, int c){
        return a + b + c;
    }
    public static int sumFourNumbers(int a, int b, int c, int d){
        return a + b + c + d;
    }
```

Good Practice
```java
    public static int sum(int a, int b){
        return a + b;
    }
    public static int sum(int a, int b, int c){
        return a + b + c;
    }
    public static int sum(int a, int b, int c, int d){
        return a + b + c + d;
    }
```

### `sum` is easier to remember and use.

## Final Notes
* Easier to remember one name
* Improve readability
* Add flexibility with diff types of data.
* Less work, more readable
