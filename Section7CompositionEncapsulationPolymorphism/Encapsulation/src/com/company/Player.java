package com.company;

public class Player {

    public String fullName; // problem. Changing this name should only impact this internal class. Now Main is bugged. Leads to extended refactoring.
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health -= damage;
        if (this.health <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining from player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
