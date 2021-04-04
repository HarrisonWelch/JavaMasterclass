# Lec 97 OOP Master Challenge

## Challenge
* The purpose of the application is to help a fictitious company called Bills Burgers to manage their process of selling hamburgers. 
* Our application will help Bill to select types of burgers, some af the additional items (additions) to be added to the burgers and pricing. 
* We want to create a base hamburger, but also two other types of hamburgers that are popular ones in Bills store. 
* The basic hamburger should have the following items. 
* Bread roll type, meat and up to 4 additional additions (things like lettuce, tomato, carrot) that the customer can select to be added to the burger. 
* Each one of these items gets charged an additional price so you need soæ way to track how nany items got added and to calculate the final price (base burger with all the additions). 
* This burger has a base price and the additions are alt separately priced (up to 4 additions, see above). 
* Create a Hamburger class to deal with all the above. 
* The constructor should only include the roll type, meat and price, can also include name of burger or you can use a setter. 
* Also create two extra varieties of Hamburgers (subclasses) to cater for 
* a) Healthy burger (on a brown rye bread roll), plus two addition items that can be added. 
  * The healthy burger can have 6 items' (Additions) in total. 
  * hint: youl probably want to process the two additional items in this new class (subclass of Hamburger), not the base class (Hamburger), since the additions are only appropriate for this new class (in other words new burger type). 
* b) Deluxe hamburger — comes with chips and drinks as additions, but no extra additions are allowed. 
  * hint: You have to find a way to automatically add these new additions at the time the deluxe burger object is created, and then prevent other additions being made. 
* All 3 classes should have a method that can be catted anytime to shov the base price of the hamburger 
* plus alt each showing the addition name, and addition price, and a grand/finat total for the burger (base price + at t additions) 
* For the two additional classes this nay require you to be looking at the base class for pricing and then adding totals to final price. 

## My Solution

Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Write your code here
        Hamburger hamburger = new Hamburger("Wheat", "Sausage", 2.50, "Burger");
        System.out.println("hamburger.getPrice() = " + hamburger.getPrice());
        hamburger.addItem("onion");
        System.out.println("hamburger.getPrice() = " + hamburger.getPrice());
        hamburger.addItem("mustard");
        System.out.println("hamburger.getPrice() = " + hamburger.getPrice());
        hamburger.addItem("onion");
        System.out.println("hamburger.getPrice() = " + hamburger.getPrice());
        hamburger.addItem("pickle");
        System.out.println("hamburger.getPrice() = " + hamburger.getPrice());
        hamburger.addItem("ketchup");
        System.out.println("hamburger.getPrice() = " + hamburger.getPrice());
        hamburger.addItem("tomato");
        System.out.println("hamburger.getPrice() = " + hamburger.getPrice());
        System.out.println("----");
        HealthyBurger healthyBurger = new HealthyBurger("Chicken", 1.85);
        System.out.println("healthyBurger.getPrice() = " + healthyBurger.getPrice());
        healthyBurger.addItem("onion");
        System.out.println("healthyBurger.getPrice() = " + healthyBurger.getPrice());
        healthyBurger.addItem("mustard");
        System.out.println("healthyBurger.getPrice() = " + healthyBurger.getPrice());
        healthyBurger.addItem("onion");
        System.out.println("healthyBurger.getPrice() = " + healthyBurger.getPrice());
        healthyBurger.addItem("pickle");
        System.out.println("healthyBurger.getPrice() = " + healthyBurger.getPrice());
        System.out.println("----");
        DeluxeBurger deluxeBurger = new DeluxeBurger("White","Sausage & Bacon", 5.65);
        System.out.println("deluxeBurger.getPrice() = " + deluxeBurger.getPrice());
        deluxeBurger.addItem("onion");
        System.out.println("deluxeBurger.getPrice() = " + deluxeBurger.getPrice());
        deluxeBurger.addItem("mustard");
        System.out.println("deluxeBurger.getPrice() = " + deluxeBurger.getPrice());
        deluxeBurger.addItem("onion");
        System.out.println("deluxeBurger.getPrice() = " + deluxeBurger.getPrice());
        deluxeBurger.addItem("pickle");
        System.out.println("deluxeBurger.getPrice() = " + deluxeBurger.getPrice());
        deluxeBurger.addItem("BBQ sauce");
        System.out.println("deluxeBurger.getPrice() = " + deluxeBurger.getPrice());
        deluxeBurger.addItem("Tomato");
        System.out.println("deluxeBurger.getPrice() = " + deluxeBurger.getPrice());
        deluxeBurger.addItem("LETTUCE");
        System.out.println("deluxeBurger.getPrice() = " + deluxeBurger.getPrice());
        deluxeBurger.addItem("bacon");
        System.out.println("deluxeBurger.getPrice() = " + deluxeBurger.getPrice());
    }
}
```
Hamburger.java
```java
package com.company;

public class Hamburger {
    public static final double PRICE_PER_ADDITION = 0.50d;
    private static final int MAX_ITEMS = 4;
    private String rollType;
    private String meatType;
    private boolean hasLettuce;
    private boolean hasTomato;
    private boolean hasPickle;
    private boolean hasMustard;
    private boolean hasKetchup;
    private boolean hasBacon;
    private boolean hasMayo;
    private boolean hasBBQSauce;
    private boolean hasOnion;
    private int itemsAdded;
    private double price;
    private double basePrice;
    private String name;

    public Hamburger(String rollType, String meatType, double price, String name) {
        this.rollType = rollType;
        this.meatType = meatType;
        this.basePrice = price;
        this.price = price;
        this.name = name;
    }

    private boolean isMaxItems(int maxItems){
        return itemsAdded >= maxItems;
    }

    public void addItem(String itemName) {
        this.addItemWithMax(itemName, Hamburger.MAX_ITEMS);
    }

    protected void addItemWithMax(String itemName, int maxItems) {
        itemName = itemName.toUpperCase();
        if (isMaxItems(maxItems)) {
            System.out.println("Burger already has max items");
            return;
        }
        switch(itemName) {
            case "LETTUCE":
                if (hasLettuce) {
                    System.out.println("Burger already has lettuce");
                    return;
                }
                this.hasLettuce = true;
                break;
            case "TOMATO":
                if (hasTomato) {
                    System.out.println("Burger already has lettuce");
                    return;
                }
                this.hasTomato = true;
                break;
            case "PICKLE":
                if (hasPickle) {
                    System.out.println("Burger already has pickle");
                    return;
                }
                this.hasPickle = true;
                break;
            case "MUSTARD":
                if (hasMustard) {
                    System.out.println("Burger already has mustard");
                    return;
                }
                this.hasMustard = true;
                break;
            case "KETCHUP":
                if (hasKetchup) {
                    System.out.println("Burger already has ketchup");
                    return;
                }
                this.hasKetchup = true;
                break;
            case "BACON":
                if (hasBacon) {
                    System.out.println("Burger already has bacon");
                    return;
                }
                this.hasBacon = true;
                break;
            case "MAYO":
                if (hasMayo) {
                    System.out.println("Burger already has mayo");
                    return;
                }
                this.hasMayo = true;
                break;
            case "BBQSAUCE":
            case "BBQ SAUCE":
            case "BBQ_SAUCE":
                if (hasBBQSauce) {
                    System.out.println("Burger already has BBQ sauce");
                    return;
                }
                this.hasBBQSauce = true;
                break;
            case "ONION":
                if (hasOnion) {
                    System.out.println("Burger already has onion");
                    return;
                }
                this.hasOnion = true;
                break;
            default:
                System.out.println("UNRECOGNIZED ITEM. NOT ADDING ITEM " + itemName + " TO BURGER.");
        }
        this.itemsAdded++;
        this.calculatePrice();
    }

    public void removeItem(String itemName) {
        itemName = itemName.toUpperCase();
        switch(itemName) {
            case "LETTUCE":
                if (!hasLettuce) {
                    System.out.println("Burger does not have lettuce");
                    return;
                }
                this.hasLettuce = true;
                break;
            case "TOMATO":
                if (!hasTomato) {
                    System.out.println("Burger does not have lettuce");
                    return;
                }
                this.hasTomato = true;
                break;
            case "PICKLE":
                if (!hasPickle) {
                    System.out.println("Burger does not have pickle");
                    return;
                }
                this.hasPickle = true;
                break;
            case "MUSTARD":
                if (!hasMustard) {
                    System.out.println("Burger does not have mustard");
                    return;
                }
                this.hasMustard = true;
                break;
            case "KETCHUP":
                if (!hasKetchup) {
                    System.out.println("Burger does not have ketchup");
                    return;
                }
                this.hasKetchup = true;
                break;
            case "BACON":
                if (!hasBacon) {
                    System.out.println("Burger does not have bacon");
                    return;
                }
                this.hasBacon = true;
                break;
            case "MAYO":
                if (!hasMayo) {
                    System.out.println("Burger does not have mayo");
                    return;
                }
                this.hasMayo = true;
                break;
            case "BBQSAUCE":
            case "BBQ SAUCE":
            case "BBQ_SAUCE":
                if (!hasBBQSauce) {
                    System.out.println("Burger does not have BBQ sauce");
                    return;
                }
                this.hasBBQSauce = true;
                break;
            case "ONION":
                if (!hasOnion) {
                    System.out.println("Burger does not have onion");
                    return;
                }
                this.hasOnion = true;
                break;
            default:
                System.out.println("UNRECOGNIZED ITEM. NOT REMOVING ITEM " + itemName + " TO BURGER.");
                return;
        }
        this.itemsAdded--;
        this.calculatePrice();
    }

    private void calculatePrice(){
        this.price = basePrice + (itemsAdded * PRICE_PER_ADDITION);
    }

    public String getRollType() {
        return rollType;
    }

    public String getMeatType() {
        return meatType;
    }

    public boolean hasLettuce() {
        return hasLettuce;
    }

    public boolean hasTomato() {
        return hasTomato;
    }

    public boolean hasPickle() {
        return hasPickle;
    }

    public boolean hasMustard() {
        return hasMustard;
    }

    public boolean hasKetchup() {
        return hasKetchup;
    }

    public boolean hasBacon() {
        return hasBacon;
    }

    public boolean hasMayo() {
        return hasMayo;
    }

    public boolean hasBBQSauce() {
        return hasBBQSauce;
    }

    public boolean hasOnion() {
        return hasOnion;
    }

    public int getItemsAdded() {
        return itemsAdded;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
```
HealthyBurger.java
```java
package com.company;

public class HealthyBurger extends Hamburger {
    public static final int MAX_ITEMS = 2;
    public HealthyBurger(String meatType, double price) {
        super("Brown Rye", meatType, price, "Healthy");
    }

    @Override
    public void addItem(String itemName) {
        super.addItemWithMax(itemName, HealthyBurger.MAX_ITEMS);
    }
}
```
DeluxeBurger.java
```java
package com.company;

public class DeluxeBurger extends Hamburger {
    public static final int MAX_ITEMS = 6;
    private boolean hasDrink;
    private boolean hasChips;
    public DeluxeBurger(String rollType, String meatType, double price) {
        super(rollType, meatType, price, "Deluxe");
        this.hasDrink = true;
        this.hasChips = true;
    }

    @Override
    public void addItem(String itemName) {
        super.addItemWithMax(itemName, DeluxeBurger.MAX_ITEMS);
    }
}
```
output
```
hamburger.getPrice() = 2.5
hamburger.getPrice() = 3.0
hamburger.getPrice() = 3.5
Burger already has onion
hamburger.getPrice() = 3.5
hamburger.getPrice() = 4.0
hamburger.getPrice() = 4.5
Burger already has max items
hamburger.getPrice() = 4.5
----
healthyBurger.getPrice() = 1.85
healthyBurger.getPrice() = 2.35
healthyBurger.getPrice() = 2.85
Burger already has max items
healthyBurger.getPrice() = 2.85
Burger already has max items
healthyBurger.getPrice() = 2.85
----
deluxeBurger.getPrice() = 5.65
deluxeBurger.getPrice() = 6.15
deluxeBurger.getPrice() = 6.65
Burger already has onion
deluxeBurger.getPrice() = 6.65
deluxeBurger.getPrice() = 7.15
deluxeBurger.getPrice() = 7.65
deluxeBurger.getPrice() = 8.15
deluxeBurger.getPrice() = 8.65
Burger already has max items
deluxeBurger.getPrice() = 8.65

Process finished with exit code 0
```