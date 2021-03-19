package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("checkNumber(42) = " + checkNumber(42));
        System.out.println("checkNumber(0) = " + checkNumber(0));
        System.out.println("checkNumber(-1) = " + checkNumber(-1));
    }

    public static String checkNumber(int number){
        if (number == 0){
            return "zero";
        } else if (number > 0) {
            return "positive";
        }
        return "negative";
    }
}
