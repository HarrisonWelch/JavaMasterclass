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
