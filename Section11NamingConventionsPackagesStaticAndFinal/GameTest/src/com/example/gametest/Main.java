package com.example.gametest;

import com.example.game.Dragons;
import com.example.game.ISaveable;
import com.example.game.Monsters;
import com.example.game.Players;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Write your code here
        System.out.println("Players:");
        ArrayList<String> stringArrayList = readValues();
        ISaveable saveablePlayers = new Players();
        saveablePlayers.populate(stringArrayList);
        saveablePlayers.save();

        System.out.println("Monsters:");
        stringArrayList = readValues();
        ISaveable saveableMonsters = new Monsters();
        saveableMonsters.populate(stringArrayList);
        saveableMonsters.save();

        System.out.println("Dragons:");
        stringArrayList = readValues();
        ISaveable saveableDragons = new Dragons();
        saveableDragons.populate(stringArrayList);
        saveableDragons.save();

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

}
