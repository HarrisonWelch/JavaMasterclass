package com.company;

public class Main {

    public static void main(String[] args) {
	    // Inheritance
        Animal animal = new Animal(
                "Animal",
                1,
                1,
                5,
                5
        );
        Dog dog = new Dog(
                "Yorkie",
                8,
                20,
                2,
                4,
                1,
                20,
                "long silky"
        );

        // This is when inheritance makes sense

        dog.eat(); // this function was defined on the parent class
        System.out.println("----");
        dog.walk();
//        dog.run();

        System.out.println("----");
        Fish fish = new Fish(
                "Mr. Fish",
                2,
                2,
                6,
                2,
                5
        );
        fish.move(7);
    }
}
