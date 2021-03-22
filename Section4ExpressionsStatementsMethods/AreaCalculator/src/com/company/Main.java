package com.company;

public class Main {

    public static void main(String[] args) {
        // AreaCalculator
    }
    public static double area(double radius){
        if (radius < 0) return -1;
        return radius * radius * Math.PI;
    }
    public static double area(double x, double y){
        if (x < 0 || y < 0) return -1;
        return x * y;
    }
}
