package com.company;

public class PC {
    private Case theCase; // case is reserved
    private Monitor monitor;
    private Motherboard motherboard;

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp() {
        getTheCase().pressPowerButton();
        drawLogo();
    }

    public void drawLogo() {
        // Make graphic logo
        this.monitor.drawPixelAt(1200, 50, "yellow");

    }

    private Case getTheCase() {
        return theCase;
    }
//
//    private Monitor getMonitor() {
//        return monitor;
//    }
//
//    private Motherboard getMotherboard() {
//        return motherboard;
//    }
}
