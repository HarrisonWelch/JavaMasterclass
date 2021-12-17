package com.lesson;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Theatre theatre = new Theatre("Olympian", 8, 12);
        theatre.getSeats();

        if (theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }

        if (theatre.reserveSeat("H11")) {
            System.out.println("Please pay");
        } else {
            System.out.println("Sorry, seat is taken");
        }
    }
}
