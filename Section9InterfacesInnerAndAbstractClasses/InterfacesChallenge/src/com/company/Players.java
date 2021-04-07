package com.company;

import java.util.ArrayList;

public class Players implements ISaveable {
    private ArrayList<String> players;

    public Players() {
        this.players = new ArrayList<>();
    }

    public Players(ArrayList<String> players) {
        this.players = players;
    }

    @Override
    public void save() {
        // for each player (actually Strings ... shhhh) in players
        for (String s : this.players) {
            System.out.println("Saving player " + s);
            saveItem(s);
        }
    }

    @Override
    public void populate(ArrayList<String> list) {
        // Invoke copy constructor
        this.players = new ArrayList<>(list);
    }

    private void saveItem(Object o){
        // saving action
        System.out.println("Saved " + o);
    }

    @Override
    public String toString() {
        String str = "";
        for (String s : this.players) {
            str += s + " ";
        }
        return str;
    }
}
