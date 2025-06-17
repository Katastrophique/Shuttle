package com.simplecity.amp_library.http.lastfm;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public class LastFmArtist implements LastFmResult {

    @SerializedName("artist")
    public Artist artist;

    private String name;
    private String bio;
    private String summary;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getBio() { return bio; }
    public void setBio(String bio) { this.bio = bio; }
    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }

    public static class Artist {
        public String name;
        @SerializedName("image")
        public List<LastFmImage> images = new ArrayList<>();
        public Bio bio;
    }

    @Override
    public String getImageUrl() {
        if (artist == null || artist.images == null || artist.images.isEmpty()) {
            return null;
        }
        return LastFmUtils.getBestImageUrl(artist.images);
    }

    public static class Bio {
        public String summary;
    }
}