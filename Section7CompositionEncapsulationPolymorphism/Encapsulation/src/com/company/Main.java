package com.company;

public class Main {

    public static void main(String[] args) {
	    // Encapsulation
//        Player player = new Player();
////        player.name = "Tim";
//        player.fullName = "Tim";
//        player.health = 20; // Problem. This may not have ANY value. ints start at 0, but could NPE if object.
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        // See the possible problem?
//        // we have all our functionality/data-checks in lose health
//        // BUT we can just access the health field directly
//
//        player.health = 200;
//        player.health -= 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        // This skips the checks (print outs)

        EnhancedPlayer player = new EnhancedPlayer("Tim", 200, "Sword"); // Setting health 200 will fail and keep default of 100.
        System.out.println("Initial health is " + player.getHitPoints());

    }
}
