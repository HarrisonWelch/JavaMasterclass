package com.company;

public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (hourOfDay < 0 || hourOfDay > 23) return false;
        return (barking && (hourOfDay > 22 || hourOfDay < 8));
    }
}
