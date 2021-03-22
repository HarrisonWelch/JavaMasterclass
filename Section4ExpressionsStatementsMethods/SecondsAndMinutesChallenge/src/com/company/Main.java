package com.company;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value"; // final means value can't change

//    * Create a method called getDurationString with 2 params, 1st param minutes and 2nd param seconds.
//    * Validate first param is >= 0
//            * Validate 2nd parameter seconds is >= 0 and <= 59
//            * The method should return "Invalid value" in the method if either of the above are not true.
//            * If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format "XXh YYm ZZs" where XX represent a number of hours, YY the minutes, and ZZ the seconds.
//    * Create a 2nd method of the same name but with only one parameter seconds
//            * validate that it is >= 0 and return invalid value if not true
//            * if true pass to the overloaded method

    public static void main(String[] args) {
        // SecondsAndMinutesChallenge
        System.out.println("getDurationString(12, 12) = " + getDurationString(12, 12));
        System.out.println("getDurationString(-15, 3) = " + getDurationString(-15, 3));
        System.out.println("getDurationString(15, -3) = " + getDurationString(15, -3));
        System.out.println("getDurationString(100) = " + getDurationString(100));
        System.out.println("getDurationString(-100) = " + getDurationString(-100));
    }
    private static String getDurationString(long minutes, long seconds){
        if (minutes < 0 || seconds < 0 || seconds > 59) return INVALID_VALUE_MESSAGE;
        long hours = minutes / 60;
        long minutesRemaining = minutes % 60;
        String hoursString = hours + "h ";
        if (hours < 10) {
            hoursString = "0" + hours;
        }
        String minutesString = minutesRemaining + "h";
        if (minutesRemaining < 10) {
            minutesString = "0" + minutesRemaining;
        }
        String secondsString = seconds + "s";
        if (seconds < 10) {
            secondsString = "0" + seconds;
        }
        return hoursString + " " + minutesString + " " + secondsString;
    }
    private static String getDurationString(long seconds){
        if (seconds < 0) return INVALID_VALUE_MESSAGE;
        long minutes = seconds / 60;
        long secondsRemaining = seconds % 60;
        return getDurationString(minutes, secondsRemaining);
    }
}
