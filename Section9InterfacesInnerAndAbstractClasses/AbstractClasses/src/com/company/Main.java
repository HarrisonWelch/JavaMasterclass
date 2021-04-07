package com.company;

public class Main {

    public static void main(String[] args) {
	    // Write your code here
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

//        Bird bird = new Bird("Parrot");
        Parrot parrot = new Parrot("Austrailian ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}
