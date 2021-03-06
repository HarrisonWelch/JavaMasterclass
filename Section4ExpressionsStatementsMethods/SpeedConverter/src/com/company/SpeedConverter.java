package com.company;

public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0.00d) return -1;
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){
        if (kilometersPerHour < 0.00d) {
            System.out.println("Invalid Value");
            return;
        }
        System.out.println(
                kilometersPerHour + " km/h = " +
                SpeedConverter.toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
