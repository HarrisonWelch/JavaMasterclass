package com.company;

public class Main {

    public static void main(String[] args) {
	    // Write your code here
        Hamburger hamburger = new Hamburger("Wheat", "Sausage", 2.50, "Burger");
        System.out.println("hamburger.getPrice() = " + hamburger.getPrice());
        hamburger.addItem("onion");
        System.out.println("hamburger.getPrice() = " + hamburger.getPrice());
        hamburger.addItem("mustard");
        System.out.println("hamburger.getPrice() = " + hamburger.getPrice());
        hamburger.addItem("onion");
        System.out.println("hamburger.getPrice() = " + hamburger.getPrice());
        hamburger.addItem("pickle");
        System.out.println("hamburger.getPrice() = " + hamburger.getPrice());
        hamburger.addItem("ketchup");
        System.out.println("hamburger.getPrice() = " + hamburger.getPrice());
        hamburger.addItem("tomato");
        System.out.println("hamburger.getPrice() = " + hamburger.getPrice());
        System.out.println("----");
        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 1.85);
        System.out.println("healthyBurger.getPrice() = " + healthyBurger.getPrice());
        healthyBurger.addItem("onion");
        System.out.println("healthyBurger.getPrice() = " + healthyBurger.getPrice());
        healthyBurger.addItem("mustard");
        System.out.println("healthyBurger.getPrice() = " + healthyBurger.getPrice());
        healthyBurger.addItem("onion");
        System.out.println("healthyBurger.getPrice() = " + healthyBurger.getPrice());
        healthyBurger.addItem("pickle");
        System.out.println("healthyBurger.getPrice() = " + healthyBurger.getPrice());
        System.out.println("----");
        DeluxeBurger deluxeBurger = new DeluxeBurger("White","Sausage & Bacon", 5.65);
        System.out.println("deluxeBurger.getPrice() = " + deluxeBurger.getPrice());
        deluxeBurger.addItem("onion");
        System.out.println("deluxeBurger.getPrice() = " + deluxeBurger.getPrice());
        deluxeBurger.addItem("mustard");
        System.out.println("deluxeBurger.getPrice() = " + deluxeBurger.getPrice());
        deluxeBurger.addItem("onion");
        System.out.println("deluxeBurger.getPrice() = " + deluxeBurger.getPrice());
        deluxeBurger.addItem("pickle");
        System.out.println("deluxeBurger.getPrice() = " + deluxeBurger.getPrice());
        deluxeBurger.addItem("BBQ sauce");
        System.out.println("deluxeBurger.getPrice() = " + deluxeBurger.getPrice());
        deluxeBurger.addItem("Tomato");
        System.out.println("deluxeBurger.getPrice() = " + deluxeBurger.getPrice());
        deluxeBurger.addItem("LETTUCE");
        System.out.println("deluxeBurger.getPrice() = " + deluxeBurger.getPrice());
        deluxeBurger.addItem("bacon");
        System.out.println("deluxeBurger.getPrice() = " + deluxeBurger.getPrice());
    }
}
