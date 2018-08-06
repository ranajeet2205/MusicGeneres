package com.example.android.musicgeneres;

public class Song {
    private String songName;
    private String artistName;
    private int songImage;


    public Song(String sName,String aName,int sImage){

        songName=sName;
        artistName=aName;
        songImage=sImage;

    }

    public String getSongName() {
        return songName;
    }

    public String getArtistName() {
        return artistName;
    }

    public int getSongImage() {
        return songImage;
    }
}
