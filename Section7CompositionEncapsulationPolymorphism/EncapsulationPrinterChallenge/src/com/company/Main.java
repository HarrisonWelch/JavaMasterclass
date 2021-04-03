package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Printer printer = new Printer(true);

        System.out.println("Initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPage(true, 4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer = " + printer.getPagesPrinted());

    }
}
