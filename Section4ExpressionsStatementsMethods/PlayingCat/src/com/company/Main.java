package com.company;

public class Main {

    public static void main(String[] args) {
        // PlayingCat
        System.out.println("isCatPlaying(true, 25) = " + isCatPlaying(true, 25));
        System.out.println("isCatPlaying(false, 36) = " + isCatPlaying(false, 36));
        System.out.println("isCatPlaying(false, 35) = " + isCatPlaying(false, 35));
        System.out.println("isCatPlaying(true, 33) = " + isCatPlaying(true, 33));
    }
    public static boolean isCatPlaying(boolean summer, int temperature){
        return (summer) ?
                (temperature >= 25 && temperature <= 45) :
                (temperature >= 25 && temperature <= 35);
    }
}
