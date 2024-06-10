package com.example.musiclibrary;

public class playlist {
    int song_idp;
    String titlep;
    String artist_Name;
    String genrep;
    String durationp;
    String languagep;

    public playlist(int song_idp, String titlep, String artist_Name, String genrep, String languagep,String durationp) {
        this.song_idp = song_idp;
        this.titlep = titlep;
        this.artist_Name = artist_Name;
        this.genrep = genrep;
        this.durationp=durationp;
        this.languagep = languagep;
    }


    public int getSong_idp() {
        return song_idp;
    }

    public void setSong_idp(int song_idp) {
        this.song_idp = song_idp;
    }

    public String getTitlep() {
        return titlep;
    }

    public void setTitlep(String titlep) {
        this.titlep = titlep;
    }

    public String getArtist_Name() {
        return artist_Name;
    }

    public void setArtist_Name(String artist_Name) {
        this.artist_Name = artist_Name;
    }

    public String getGenrep() {
        return genrep;
    }

    public void setGenrep(String genrep) {
        this.genrep = genrep;
    }

    public String getLanguagep() {
        return languagep;
    }

    public void setLanguagep(String languagep) {
        this.languagep = languagep;
    }
    public String getDurationp() {
        return durationp;
    }

    public void setDurationp(String durationp) {
        this.durationp = durationp;
    }
}
