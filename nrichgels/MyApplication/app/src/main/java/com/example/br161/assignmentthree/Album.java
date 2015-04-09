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

    public Album( String albumName, String artist, String publisher, int trackCount, int year)
    {
        this.albumName = albumName;
        this.artist = artist;
        this.publisher = publisher;
        this.trackCount = trackCount;
        this.year = year;
    }

    public String getAlbumName()
    {
        return albumName;
    }//End method getAlbumName
    public String getArtist()
    {
        return artist;
    }//End method getArtist
    public String getPublisher() { return publisher;}//End method getPublisher
    public int getTrackCount() { return trackCount;}//End method getTrackCount
    public int getYear() { return year;}//End method getYear
}// End class Album
