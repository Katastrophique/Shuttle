package com.simplecity.amp_library.model;

public class UserSelectedArtwork {

    private int type;
    private String path;

    public int getType() { return type; }
    public String getPath() { return path; }

    public UserSelectedArtwork(@ArtworkProvider.Type int type, String path) {
        this.type = type;
        this.path = path;
    }

    @Override
    public String toString() {
        return "UserSelectedArtwork{" +
                "type=" + type +
                ", path='" + path + '\'' +
                '}';
    }
}
