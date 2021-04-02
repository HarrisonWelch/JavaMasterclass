package com.company;

public class EnhancedPlayer {
    private String name;
    private int hitPoints = 100; // Define default value
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        // Basic validation
        if (health > 0 && health <= 100){
            this.hitPoints = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.hitPoints -= damage;
        if (this.hitPoints <= 0) {
            System.out.println("Player knocked out");
            // Reduce number of lives remaining from player
        }
    }

    public int getHealth() {
        return hitPoints;
    }
}
