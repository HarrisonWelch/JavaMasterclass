# Lec 61 Bonus Challenge

## Going from the Seconds And Minutes Challenge from Lec 60
* Zero pad the hours, minutes, seconds
* Use final values

## Updated solution
```java
package com.company;

public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value"; // final means value can't change

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

```
