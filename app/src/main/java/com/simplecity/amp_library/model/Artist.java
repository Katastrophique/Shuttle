package com.simplecity.amp_library.model;

import java.io.Serializable;

public class Artist implements Serializable {

    private long id;
    private String name;
    private int numAlbums;
    private int numSongs;

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getNumAlbums() { return numAlbums; }
    public void setNumAlbums(int numAlbums) { this.numAlbums = numAlbums; }

    public int getNumSongs() { return numSongs; }
    public void setNumSongs(int numSongs) { this.numSongs = numSongs; }

    public Artist(long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Artist artist = (Artist) o;

        if (id != artist.id) return false;
        if (numAlbums != artist.numAlbums) return false;
        if (numSongs != artist.numSongs) return false;
        return name != null ? name.equals(artist.name) : artist.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + numAlbums;
        result = 31 * result + numSongs;
        return result;
    }
}