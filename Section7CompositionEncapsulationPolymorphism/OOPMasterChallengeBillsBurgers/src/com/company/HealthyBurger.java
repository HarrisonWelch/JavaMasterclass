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
