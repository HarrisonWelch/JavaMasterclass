package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        byte b = 2;
        short s = 3;
        int i = 4;
        long l = 50000L + (10L * (b + s + i));
        System.out.println(l);

        short sh = (short)(1000 + 10 *
                (b + s + i));
    }
}
