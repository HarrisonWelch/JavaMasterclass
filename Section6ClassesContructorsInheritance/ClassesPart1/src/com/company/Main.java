package com.company;

public class Main {

    public static void main(String[] args) {
	    // Classes Part 1
        Car porsche = new Car();
        Car holden = new Car();
        // System.out.println("Model = " + porsche.getModel()); // null is the default state
        // porsche.model = "Carrera"; // Not great idea. Violates encapsulation
        porsche.setModel("911");
        System.out.println("Model = " + porsche.getModel());
    }
}
