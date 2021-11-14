package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LeagueTable<T extends Team> {
    private ArrayList<T> teams;

    public LeagueTable() {
        this.teams = new ArrayList<>();
    }

    public void addTeam(T team) {
        this.teams.add(team);
    }

    public void printLeague() {
        // sort
        Collections.sort(this.teams, new Comparator<T>() {
            @Override
            public int compare(T o1, T o2) {
                return o1.compareTo(o2);
            }
        });
        // print
        int i = 0;
        for (T t: this.teams) {
            System.out.println("Rank #"+ ++i + ": " + t.getName() + " ... (ranking: " + t.ranking() + ")");
        }
    }
}
