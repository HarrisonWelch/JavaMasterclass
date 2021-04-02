package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("220B","Dell","240", dimensions);

        // creating instance of class without a variable name-------------------------------v
        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherboard); // Composition

        // How do we access the composed objects? Such as drawPixel on the monitor?
//        thePC.getMonitor().drawPixelAt(1550, 1200, "red");

        // Likewise with the mother board
//        thePC.getMotherboard().loadProgram("Windows 1.0");

        // Likewise with the case
//        thePC.getTheCase().pressPowerButton();
        thePC.powerUp();
    }

}
