package com.company;

public class Room {
    private Lamp lamp;
    private Sofa sofa;
    private Chair chair;
    private TV tv;
    private Stereo stereo;

    public Room(Lamp lamp, Sofa sofa, Chair chair, TV tv, Stereo stereo) {
        this.lamp = lamp;
        this.sofa = sofa;
        this.chair = chair;
        this.tv = tv;
        this.stereo = stereo;
    }

    public Lamp getLamp() {
        return lamp;
    }

    public Sofa getSofa() {
        return sofa;
    }

    public Chair getChair() {
        return chair;
    }

    public TV getTv() {
        return tv;
    }

    public Stereo getStereo() {
        return stereo;
    }
}
