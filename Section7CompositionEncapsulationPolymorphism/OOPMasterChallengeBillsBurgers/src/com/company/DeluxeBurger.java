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
