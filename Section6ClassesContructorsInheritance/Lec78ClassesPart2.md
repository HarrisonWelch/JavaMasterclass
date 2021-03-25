# Lec 78 Classes Part 2

## Getters & Setters
* All the access or modification of class fields

### Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Classes Part 1
        Car porsche = new Car();
        Car holden = new Car();
        // System.out.println("Model = " + porsche.getModel()); // null is the default state
        // porsche.model = "Carrera"; // Not great idea. Violates encapsulation
        porsche.setModel("911");
        System.out.println("Model = " + porsche.getModel());
    }
}
```
### Car.java
```java
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
```
output
```
Model = Unknown
```
* output is unknown because it is not a carrera or commodore as seen in the setModel
* Note the `.equals()` on the string
