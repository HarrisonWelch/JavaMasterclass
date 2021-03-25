package com.company;

public class Car {

    // Fields
    private int doors; // notices the access modifier
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model) {
        String validModel = model.toLowerCase();
        if (validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
        // The model parameter model and the field are different
        // this.model = model;
        // this.model reference the object string (the field of the calling object)
        // model references the passed in string
    }

    public String getModel() {
        return this.model;
    }
}
