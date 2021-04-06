# Coding Exercise 46 Playlist

## Solution
```java
package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String songTitle, double duration) {
        if (findSong(songTitle) == null) {
            this.songs.add(new Song(songTitle, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String songTitle) {
        for (Song song : this.songs) {
            if (song.getTitle().equals(songTitle)) {
                return song;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {

        if (trackNumber <= 0) {
            return false;
        }

        if (trackNumber > songs.size()) {
            return false;
        }

        Song songFromAlbum = this.songs.get(trackNumber - 1);
        String titleOfSongFromAlbum = songFromAlbum.getTitle();
        ListIterator<Song> playListIterator = playlist.listIterator();
        while (playListIterator.hasNext()) {
            if (playListIterator.next().getTitle().compareTo(titleOfSongFromAlbum) == 0) {
                return false;
            }
        }

        playlist.add(songFromAlbum);
        return true;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playlist) {
        Song songFromAlbum = findSong(songTitle);
        if (songFromAlbum == null) {
            return false;
        }
        for (Song song : playlist) {
            if (song.getTitle().equals(songTitle)) {
                return false;
            }
        }
        playlist.add(songFromAlbum);
        return true;
    }
}
```
Song.java
```java
package com.company;

public class Song {
    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
```
