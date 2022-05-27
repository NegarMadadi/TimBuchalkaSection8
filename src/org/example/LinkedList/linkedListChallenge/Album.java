package org.example.LinkedList.linkedListChallenge;

//1. Album
//
//It has three fields, two Strings called name and artist, and an ArrayList that holds objects of type Song called songs.
//
// A constructor that accepts two Strings (name of the album and artist). It initialises the fields and instantiates songs.
//
//And three methods, they are:
//
// addSong(), has two parameters of type String (title of song), double (duration of song) and returns a boolean.
// Returns true if the song was added successfully or false otherwise.
//
// findSong(), has one parameter of type String (title of song) and returns a Song.
// Returns the Song if it exists, null if it doesn't exists.
//
// addToPlayList(), has two parameters of type int (track number of song in album) and LinkedList (the playlist) that holds objects of type Song,
// and returns boolean. Returns true if it exists and it was added successfully using the track number, or false otherwise.
//
// addToPlayList(), has two parameters of type String (title of song) and LinkedList (the playlist) that holds objects of type Song,
// and returns boolean. Returns true if it exists and it was added successfully using the name of the song, or false otherwise.

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        songs = new ArrayList<Song>();
    }

    public boolean addSong(String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song checkedSong : this.songs) {
            if (checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlayList(int trackNumber, LinkedList<Song> playlist) {
        int index = trackNumber - 1;
        if ((index >= 0) && (index <= this.songs.size())) {
            playlist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {
        Song checkSong = findSong(songTitle);
        if (checkSong != null) {
            playList.add(checkSong);
            return true;
        }
        System.out.println("The song  " + songTitle + " is not in this album");
        return false;
    }
}
