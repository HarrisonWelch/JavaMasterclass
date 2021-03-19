package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        System.out.println("BarkingDog.shouldWakeUp(true, 1) = " + BarkingDog.shouldWakeUp(true, 1));
        System.out.println("BarkingDog.shouldWakeUp(true, 1) = " + BarkingDog.shouldWakeUp(false, 2));
        System.out.println("BarkingDog.shouldWakeUp(true, 1) = " + BarkingDog.shouldWakeUp(true, 8));
        System.out.println("BarkingDog.shouldWakeUp(true, 1) = " + BarkingDog.shouldWakeUp(true, -1));
    }
}
