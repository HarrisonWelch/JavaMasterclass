package com.company;

public class Main {

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
}
