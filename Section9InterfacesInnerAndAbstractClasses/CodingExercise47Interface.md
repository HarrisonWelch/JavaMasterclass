# Coding Exercise 47 Interface

## Soltion
ISaveable.java
```java
package com.company;

import java.util.List;

public interface ISaveable {
    List<String> write();
    void read(List<String> list);
}
```
Player.java
```java
package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private String weapon;
    private int hitPoints;
    private int strength;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.weapon = "Sword";
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<String>();
        list.add(this.name);
        list.add(this.hitPoints + "");
        list.add(this.strength + "");
        list.add(this.weapon);
        return list;
    }

    @Override
    public void read(List<String> list) {
        if (list == null ||
            list.size() < 4) {
            return;
        }
        this.name = list.get(0);
        this.hitPoints = Integer.parseInt(list.get(1));
        this.strength = Integer.parseInt(list.get(2));
        this.weapon = list.get(3);
    }

    @Override
    public String toString() {
        return "Player{" +
               "name='" + this.name + "', "+
               "hitPoints=" + this.hitPoints + ", "+
               "strength=" + this.strength + ", "+
               "weapon='" + this.weapon+"" +
               "'}";
    }
}
```
Monster.java
```java
package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> list = new ArrayList<>();
        list.add(this.name);
        list.add(this.hitPoints + "");
        list.add(this.strength + "");
        return list;
    }

    @Override
    public void read(List<String> list) {
        if (list == null ||
            list.size() < 3) {
            return;
        }
        this.name = list.get(0);
        this.hitPoints = Integer.parseInt(list.get(1));
        this.strength = Integer.parseInt(list.get(2));
    }

    @Override
    public String toString() {
        return "Monster{" +
               "name='" + this.name + "', " +
               "hitPoints=" + this.hitPoints + ", " +
               "strength=" + this.strength +
               "}";
    }
}
```
