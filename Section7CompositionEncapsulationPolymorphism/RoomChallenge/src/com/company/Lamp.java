package com.company;

public class Lamp {
    private boolean hasBulb;
    private boolean isOn;
    private int lumens;

    public Lamp(boolean hasBulb, boolean isOn, int lumens) {
        this.hasBulb = hasBulb;
        this.isOn = isOn;
        this.lumens = lumens;
    }

    public void toggleOnOff(){
        System.out.println("Toggling the lamp from " + this.isOn() + " to " + !this.isOn());
        this.isOn = !this.isOn();
    }

    public boolean isHasBulb() {
        return hasBulb;
    }

    private boolean isOn() {
        return isOn;
    }

    public int getLumens() {
        return lumens;
    }
}
