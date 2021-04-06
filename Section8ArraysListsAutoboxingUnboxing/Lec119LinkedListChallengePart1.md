# Lec 119 Linked List Challenge Part 1

## Challenge
* Create a playlist for songs
* Create Song class having Title and Duration for a song
* The program will have an Album class containing a List of songs
* The albums will be stored in an ArrayList
* Songs from diff albums can be added to the playlist and will appear in the list in the order they are added
* Once the songs have been added to the playlist, create a menu of options to
* Quit, Skip forward to the next song, skip backwards to a previous song. Replay the current song. List songs in the playlist
* A song must exist in an album before it can be added to the playlist (so you play only songs that you own)
* Hint to replay a song, consider what happened when we went back and forth from a city before we started tracking the direction we were going as an opition

## My solution
Main.java
```java
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
```
Playlist.java
```java
package com.company;

import java.util.LinkedList;

public class Playlist {
    private String name;
    private LinkedList<SongAlbumPair> songAlbumPairs;
    private LinkedList<Album> albumsAvailable;

    public Playlist(String name) {
        this.name = name;
        this.songAlbumPairs = new LinkedList<SongAlbumPair>();
        this.albumsAvailable = new LinkedList<Album>();
    }

    public LinkedList<SongAlbumPair> getSongAlbumPairs() {
        return songAlbumPairs;
    }

    public boolean addSong(String albumName, String songName) {

//        System.out.println("albumName = " + albumName);
        Album album = getAlbumByName(albumName);

        // Album must be available
        if (album != null) {
//            System.out.println("Album was found! albumName = " + albumName);
            Song songAvailable = getSongFromAlbumsAvailableByAlbumNameAndSongName(albumName, songName);
            Song songInList = getSongFromPlayListByAlbumNameAndSongName(albumName, songName);
            // song must NOT exist
            if (songAvailable != null && songInList == null) {
//                System.out.println("Adding song " + songName);
                this.songAlbumPairs.add(new SongAlbumPair(songAvailable, album));
                return true; // return result of adding song (false if failed)
            }
        }
        return false;
    }

    public boolean addAlbumToAlbumsAvailable(Album album) {
        Album album1 = getAlbumByName(album.getName());
        if (album1 == null) {
            this.albumsAvailable.add(album);
            return true;
        }
        return false;
    }

    public Album getAlbumByName(String albumName) {
        for (Album album : this.albumsAvailable) {
            if (album.getName().equals(albumName)) {
                return album;
            }
        }
        return null;
    }

    public Song getSongFromAlbumsAvailableByAlbumNameAndSongName(String albumName, String songName) {
        Album album = getAlbumByName(albumName);
//        System.out.println("song I want = '" + songName + "'");
        for (Song song : album.getSongs()) {
//            System.out.println("song.getTitle() = " + song.getTitle());
            if(song.getTitle().equals(songName)) {
//                System.out.println("Found song!");
                return song;
            }
        }
        return null;
    }

    public Song getSongFromPlayListByAlbumNameAndSongName(String albumName, String songName) {
        Album album = getAlbumByName(albumName);
        for (SongAlbumPair songAlbumPair : this.songAlbumPairs) {
            if (songAlbumPair.getSong().getTitle().equals(songName)) {
                return songAlbumPair.getSong();
            }
        }
        return null;
    }

    public void printPlaylist() {
        for (SongAlbumPair songAlbumPair : this.songAlbumPairs) {
            System.out.println("Album = " + songAlbumPair.getAlbum().getName() + ", Song = " + songAlbumPair.getSong().getTitle());
        }
    }
}
```
SongAlbumPair.java
```java
package com.company;

public class SongAlbumPair {
    Song song;
    Album album;

    public SongAlbumPair(Song song, Album album) {
        this.song = song;
        this.album = album;
    }

    public void setSong(Song song) {
        this.song = song;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Song getSong() {
        return song;
    }

    public Album getAlbum() {
        return album;
    }

    @Override
    public String toString() {
        return this.song.getTitle() + " by " + this.album.getName();
    }
}
```
Album.java
```java
package com.company;

import java.util.ArrayList;

public class Album {
    private String name;
    private String artistName;
    private ArrayList<Song> songs;
    private int albumDurationMinutes;

    public Album(String name, String artistName) {
        this.name = name;
        this.artistName = artistName;
        this.songs = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getArtistName() {
        return artistName;
    }

    public ArrayList<Song> getSongs() {
        return songs;
    }

    public int getAlbumDurationMinutes() {
        return albumDurationMinutes;
    }

    public boolean addSong(String songName, int songDurationMinutes) {
        if (getSongByTitle(songName) == null) {
            this.songs.add(new Song(songName, songDurationMinutes));
        }
        return false;
    }

    public Song getSongByTitle(String songTitle) {
        for (Song song : this.songs) {
            if (song.getTitle().equals(songTitle)) {
                return song;
            }
        }
        return null;
    }
}
```
Song.java
```java
package com.company;

public class Song {
    private String title;
    private int durationMinutes;

    public Song(String title, int durationMinutes) {
        this.title = title;
        this.durationMinutes = durationMinutes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }
}
```
