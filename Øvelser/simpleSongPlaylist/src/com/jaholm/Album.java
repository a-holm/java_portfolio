package com.jaholm;

import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private LinkedList<Song> albumSongs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.albumSongs = new LinkedList<Song>();
    }

    public boolean addSong(String title, double duration){
        if (findSong(title) == null){
            this.albumSongs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    private Song findSong(String title){
        for (Song checkedSong: this.albumSongs) {
            if(checkedSong.getTitle().equals(title)) {
                return checkedSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int tracknumber, LinkedList<Song> playlist){
        int index = tracknumber-1;
        if ((index>0) && (index<= this.albumSongs.size())){
            playlist.add(this.albumSongs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + tracknumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playlist){
        Song checkedSong = findSong(title);
        if (checkedSong!=null){
            playlist.add(checkedSong);
            return true;
        }
        System.out.println("The song \"" + title + "\" is not in this album");
        return false;
    }

}
