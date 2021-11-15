package com.challenge.scope;

import java.util.Scanner;

public class X {
    int x;
    public X(Scanner x) {
        System.out.print("Please enter a number: ");
        this.x = x.nextInt();
        System.out.println();
    }

    public void x() {
        for (int x = 1; x < 13; x++) {
            System.out.println(x + " times " + this.x + " equals " + (x*this.x));
        }
    }
}
