package com.lesson._final;

public class SomeClass {

    private static int classCounter = 0;
    public int instanceNumber = 1;
    private final String name;

    public SomeClass(String name) {
        this.name = name;
        classCounter++;
        instanceNumber = classCounter; // cannot do with final
        System.out.println(name + " created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
