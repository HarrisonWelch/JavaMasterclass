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
