# Coding Exercise 34 Complex Operations

## Summary
* Class: ComplexNumber
* Fields: real, imaginary
* Method: add
  * Overload 1: real, imaginary - add the passed in real and imaginery to the object's real and imaginary values
  * Overload 2: ComplexNumber - add the passed in ComplexNumber real and imaginary components to the object's real and imaginary values
* Method: subtract
  * Overload 1: real, imaginary - subtract the passed in real and imaginery to the object's real and imaginary values
  * Overload 2: ComplexNumber - subtract the passed in ComplexNumber real and imaginary components to the object's real and imaginary values

## Solution
ComplexNumber.java
```java
package com.company;

public class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber complexNumber) {
        this.real += complexNumber.getReal();
        this.imaginary += complexNumber.getImaginary();
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }

    public void subtract(ComplexNumber complexNumber) {
        this.real -= complexNumber.getReal();
        this.imaginary -= complexNumber.getImaginary();
    }

}
```
