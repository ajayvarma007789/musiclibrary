package com.example.musiclibrary;

public class songs {

    int song_id;
    String title;
    String artist_Name;
    String genre;
    String duration;
    String language;

    public songs(int song_id, String title, String artist_Name, String genre, String language,String duration) {
        this.song_id = song_id;
        this.title = title;
        this.artist_Name = artist_Name;
        this.genre = genre;
        this.duration=duration;
        this.language = language;
    }


    public int getSong_id() {
        return song_id;
    }

    public void setSong_id(int song_id) {
        this.song_id = song_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist_Name() {
        return artist_Name;
    }

    public void setArtist_Name(String artist_Name) {
        this.artist_Name = artist_Name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
