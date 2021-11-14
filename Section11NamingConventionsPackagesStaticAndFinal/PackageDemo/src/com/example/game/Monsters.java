package com.example.game;

import java.util.ArrayList;

public class Monsters implements ISaveable {

    private ArrayList<String> monsters;

    public Monsters() {
        this.monsters = new ArrayList<>();
    }

    public Monsters(ArrayList<String> monsters) {
        this.monsters = monsters;
    }

    @Override
    public void save() {
        for (String s : this.monsters) {
            System.out.println("Saving monster " + s);
            saveItem(s);
        }
    }

    @Override
    public void populate(ArrayList<String> list) {
        // Copy constructor
        this.monsters = new ArrayList<>(list);
    }

    private void saveItem(Object o) {
        // Save action
        System.out.println("Saved " + o);
    }

    @Override
    public String toString() {
        String str = "";
        for (String s : this.monsters) {
            str += s + " ";
        }
        return str;
    }
}
