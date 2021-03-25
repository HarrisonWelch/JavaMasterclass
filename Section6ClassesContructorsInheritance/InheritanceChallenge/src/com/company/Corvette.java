package com.company;

public class Corvette extends Car {
    private int cyclinders;
    private int heightOffRode;

    public Corvette() {
        super(0,0,0);
    }

    public Corvette(int cyclinders, int heightOffRode) {
        super(0,0,0);
        this.cyclinders = cyclinders;
        this.heightOffRode = heightOffRode;
    }

    public Corvette(int steering, int gear, int speed, int cyclinders, int heightOffRode) {
        super(steering, gear, speed);
        this.cyclinders = cyclinders;
        this.heightOffRode = heightOffRode;
    }

    public Corvette(String name, String size, int steering, int gear, int speed, int cyclinders, int heightOffRode) {
        super(name, size, steering, gear, speed);
        this.cyclinders = cyclinders;
        this.heightOffRode = heightOffRode;
    }
}
