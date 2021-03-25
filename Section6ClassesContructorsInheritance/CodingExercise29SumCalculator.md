# CodingExercise29SumCalculator

## Summary 
* Create class SimpleCalculator
* It has fields firstNumber and secondNumber
* Normal getters and setters
* getAdditionResult - return the addition of firstNumber and secondNumber
* getSubtractionResult - return the subtraction of firstNumber and secondNumber
* getMultiplicationResult - return the multiplication of firstNumber and secondNumber
* getDivisionResult - return the division of firstNumber and secondNumber

## Solution
```java
package com.company;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getFirstNumber() {
        return firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public double getAdditionResult() {
        return firstNumber + secondNumber;
    }

    public double getSubtractionResult() {
        return firstNumber - secondNumber;
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }

    public double getDivisionResult() {
        return (secondNumber == 0) ? 0.0 : (firstNumber / secondNumber);
    }
}
```