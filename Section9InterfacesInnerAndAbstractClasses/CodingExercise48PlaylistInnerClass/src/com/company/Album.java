package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String songTitle, double duration) {
        if (this.songs.findSong(songTitle) == null) {
            this.songs.add(new Song(songTitle, duration));
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {

        if (trackNumber <= 0) {
            return false;
        }

        if (trackNumber > songs.songs.size()) {
            return false;
        }

        Song songFromAlbum = this.songs.songs.get(trackNumber - 1);
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
        Song songFromAlbum = this.songs.findSong(songTitle);
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

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        private boolean add(Song song) {
            if (findSong(song.getTitle()) == null) {
                this.songs.add(song);
            }
            return false;
        }

        private Song findSong(String songName) {
            for (Song song : this.songs) {
                if (song.getTitle().equals(songName)) {
                    return song;
                }
            }
            return null;
        }

        private Song findSong(int trackNumber) {
            if (trackNumber <= 0 ||
                trackNumber-1 < this.songs.size()) {
                return null;
            }
            for (Song song : this.songs) {
                if (song.getTitle().equals(this.songs.get(trackNumber-1).getTitle())) {
                    return song;
                }
            }
            return null;
        }
    }
}
