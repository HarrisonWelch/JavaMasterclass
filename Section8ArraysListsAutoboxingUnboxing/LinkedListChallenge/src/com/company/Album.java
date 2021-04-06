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
