package com.company;

import java.util.ListIterator;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
	    // Write your code here

        Album album = new Album("Album1", "Harry");
        album.addSong("Yeet", 12);
        album.addSong("Skeet", 3);
        album.addSong("Wheat", 6);
        album.addSong("1337", 1337);

        Album album1 = new Album("Old school memes", "Internet");
        album1.addSong("Its Lit", 3);
        album1.addSong("Rick Roll", 5);
        album1.addSong("DeezNuts", 2);
        album1.addSong("YOLO", 420);
        album1.addSong("Look at this graph", 420);

        Album album2 = new Album("Dark Horse", "Nickelback");
        album2.addSong("Next Go Round", 4);
        album2.addSong("Just to Get High", 5);
        album2.addSong("Never Gonna Be Alone", 4);
        album2.addSong("Shakin' Hands", 4);

        Playlist playlist = new Playlist("MyPlaylist");

        boolean res = false;
        res = playlist.addAlbumToAlbumsAvailable(album1);
        if (!res) System.out.println("fail 1");

        res = playlist.addAlbumToAlbumsAvailable(album2);
        if (!res) System.out.println("fail 2");

        res = playlist.addSong("Album1", "Yeet");
        if (!res) System.out.println("Failed to add Yeet from Album 1 (This is good, Album1 does not exist)");

        res = playlist.addSong("Dark Horse", "Never Gonna Be Alone");
        if (!res) System.out.println("Failed to add Never Gonna Be Alone from Dark Horse (bad)");

        res = playlist.addSong("Dark Horse", "Never Gonna Be Alone");
        if (!res) System.out.println("Failed to add Never Gonna Be Alone from Dark Horse (good)");

        res = playlist.addSong("Old school memes", "Dark Horse");
        if (!res) System.out.println("Failed to add Never Old school memes from Dark Horse (good)");

        res = playlist.addSong("Old school memes", "YOLO");
        if (!res) System.out.println("Failed to add YOLO from Old school memes");

        res = playlist.addSong("Old school memes", "DeezNuts");
        if (!res) System.out.println("Failed to add YOLO from Old school memes");

        playlist.printPlaylist();

//
//
//        res = playlist.addSong("Old school memes", "YOLO");
//        if (!res) System.out.println("Failed to add YOLO from Old school memes");
//
//        res = playlist.addSong("Old school memes", "YOLO");
//        if (!res) System.out.println("Failed to add YOLO from Old school memes again");
        // album (no digit) is not available

        boolean quit = false;
        printMenu();
        int choice = -1;
        ListIterator<SongAlbumPair> songAlbumPairListIterator = playlist.getSongAlbumPairs().listIterator();
        boolean goingForward = true;
        SongAlbumPair currSong = playlist.getSongAlbumPairs().get(0);
        while (!quit) {
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    // QUIT
                    System.out.println("Quiting...");
                    quit = true;
                    break;
                case 1:
                    // NEXT SONG
                    if (!goingForward) {
                        if (songAlbumPairListIterator.hasNext()) {
                            songAlbumPairListIterator.next();
                        }
                        goingForward = true;
                    }
                    if (songAlbumPairListIterator.hasNext()) {
                        currSong = songAlbumPairListIterator.next();
                        System.out.println("Now playing " + currSong);
                    } else {
                        System.out.println("Reached end of the playlist");
                    }
                    break;
                case 2:
                    // PREV SONG
                    if (goingForward) {
                        if (songAlbumPairListIterator.hasPrevious()) {
                            songAlbumPairListIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (songAlbumPairListIterator.hasPrevious()) {
                        currSong = songAlbumPairListIterator.previous();
                        System.out.println("Now playing " + currSong);
                    } else {
                        System.out.println("We are at the start of the list");
                    }
                    break;
                case 3:
                    // Replay
                    System.out.println("Now Playing " + currSong);
                    break;
                case 4:
                    System.out.println("Playlist:");
                    playlist.printPlaylist();
                    break;
                case 5:
                    System.out.println("Printing Menu...");
                    printMenu();
                    break;
                default:
                    System.out.println("? Unknown choice ?");
                    break;
            }
        }
    }

    public static void printMenu() {
        System.out.println("Menu:\n" +
                "\t" + "0 - Quit\n" +
                "\t" + "1 - Skip forward to next song\n" +
                "\t" + "2 - Skip backwards to previous song\n" +
                "\t" + "3 - Replay current song\n" +
                "\t" + "4 - List songs in playlist\n" +
                "\t" + "5 - Print menu\n" +
                "Choice: ");
    }
}
