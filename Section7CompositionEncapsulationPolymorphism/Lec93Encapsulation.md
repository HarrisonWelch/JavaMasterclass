# Lec 93 Encapsulation

## Encapsulation
* Data hiding
* Prevent unhandled code change

## Let's do it the wrong way with no data-hiding
* public access
* No Setter/Getter
* Direct access in Main.java

Player.java
```java
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
```
Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
	    // Encapsulation
        Player player = new Player();
//        player.name = "Tim";
        player.fullName = "Tim";
        player.health = 20; // Problem. This may not have ANY value. ints start at 0, but could NPE if object.
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        damage = 11;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        // See the possible problem?
        // we have all our functionality/data-checks in lose health
        // BUT we can just access the health field directly

        player.health = 200;
        player.health -= 10;
        player.loseHealth(damage);
        System.out.println("Remaining health = " + player.healthRemaining());

        // This skips the checks (print outs)
    }
}
```
output
```
Remaining health = 10
Player knocked out
Remaining health = -1
Remaining health = 179
```

## Now let's Redo it with proper *Encapsulation*
* Private Access
* Change internal variable names
  * Refactoring IntelliJ tutorial

EnhancedPlayer.java
```java
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
```
Main.java
```java
package com.company;

public class Main {

    public static void main(String[] args) {
        // This skips the checks (print outs)
        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword"); // Setting health 200 will fail and keep default of 100.
        System.out.println("Initial health is " + player.getHitPoints());

    }
}
```
