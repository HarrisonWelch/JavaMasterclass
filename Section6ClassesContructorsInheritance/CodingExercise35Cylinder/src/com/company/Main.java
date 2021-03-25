package com.company;

public class Main {

    public static void main(String[] args) {
	    // Coding Exercise 35 Cylinder
        Circle circle = new Circle(3.75);
        System.out.println("circle.radius = " + circle.getRadius());
        System.out.println("circle.area = " + circle.getArea());
        Cylinder cyclinder = new Cylinder(5.55, 7.25);
        System.out.println("cyclinder.radius = " + cyclinder.getRadius());
        System.out.println("cyclinder.height = " + cyclinder.getHeight());
        System.out.println("cyclinder.area = " + cyclinder.getArea());
        System.out.println("cyclinder.volume = " + cyclinder.getVolume());

    }
}
