# Coding Exercise 30 Person

## Summary
* Create a Person class
* Fields: firstName, lastName, age
* Normal setters and getters
* Method isTeen returns if the person is > 12 and < 20 (a teenager)
* Method getFullName returns the first + last name of the person
  * if first name is empty return last name
  * if last name is empty return first name
  * if both are empty return the empty string
  * return `firstName + " " + lastName`

## Solution
```java
package com.company;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = (age < 0 || age > 100) ? 0 : age;
    }

    public boolean isTeen() {
        return (age > 12 && age < 20);
    }

    public String getFullName() {
        if (this.firstName.isEmpty()) return lastName;
        if (this.lastName.isEmpty()) return firstName;
        if (this.firstName.isEmpty() && this.lastName.isEmpty()) return "";
        return this.firstName + " " + this.lastName;
    }

}
```