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
