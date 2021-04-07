package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }

        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = songs.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }

    private class SongList  {
        private ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }

        public boolean addToPlayList(Song song) {
            if (findSong(song) == null) {
                this.songs.add(song);
                return true;
            }
            return false;
        }

        public Song findSong(Song song) {
            for (Song songI : this.songs) {
                if (song.getTitle().equals(songI.getTitle())) {
                    return song;
                }
            }
            return null;
        }

        public Song findSong(String songName) {
            for (Song songI : this.songs) {
                if (songName.equals(songI.getTitle())) {
                    return songI;
                }
            }
            return null;
        }

        public Song findSong(int trackNumber) {
            if (trackNumber < 0 || (trackNumber-1) > this.songs.size()) {
                return null;
            }
            for (Song songI : this.songs) {
                if (this.songs.get(trackNumber-1).getTitle().equals(songI.getTitle())) {
                    return songI;
                }
            }
            return null;
        }

        public boolean add(Song song) {
            this.addToPlayList(song);
            return true;
        }

    }
}
