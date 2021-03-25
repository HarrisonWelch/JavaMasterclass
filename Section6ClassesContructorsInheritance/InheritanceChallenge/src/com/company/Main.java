package com.company;

public class Main {

    public static void main(String[] args) {
	    // Inheritance Challenge
        Outlander outlander = new Outlander(0,0,1,36);
        outlander.steer(45);
        outlander.accelerate(30);
        outlander.accelerate(20);
        outlander.accelerate(-42);
    }
}
