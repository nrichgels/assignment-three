package com.example.br161.assignmentthree;

/**
 * Created by rl1065uq on 3/30/2015.
 */
public class Album {
    private String albumName;
    private String artist;
    private String publisher;
    private int trackCount;
    private int year;

    public Album( String albumName, String artist)
    {
        this.albumName = albumName;
        this.artist = artist;
    }//End constructor

    public String getAlbumName()
    {
        return albumName;
    }//End method getAlbumName

    public String getArtist()
    {
        return artist;
    }//End method getArtist
}// End class Album
