package com.example.game;

import java.util.ArrayList;

public class Dragons implements ISaveable {

    private ArrayList<String> dragons;

    public Dragons() {
        this.dragons = new ArrayList<>();
    }

    public Dragons(ArrayList<String> dragons) {
        this.dragons = dragons;
    }

    @Override
    public void save() {
        for (String s : this.dragons) {
            System.out.println("Saving dragon " + s);
            saveItem(s);
        }
    }

    @Override
    public void populate(ArrayList<String> list) {
        this.dragons = new ArrayList<>(list);
    }

    private void saveItem(Object o) {
        System.out.println("Saved " + o);
    }

    @Override
    public String toString() {
        String str = "";
        for (String s : this.dragons) {
            str += s + " ";
        }
        return str;
    }
}
