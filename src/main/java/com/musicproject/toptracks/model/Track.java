package com.musicproject.toptracks.model;

public class Track {
    String title;
    String artist;
    String genre;
    int playCount;

    public Track() {
    }

    public Track(String title, String artist, String genre, int playCount) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
        this.playCount = playCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPlayCount() {
        return playCount;
    }

    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

}
