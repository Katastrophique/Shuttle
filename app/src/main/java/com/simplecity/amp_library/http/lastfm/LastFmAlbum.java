package com.simplecity.amp_library.http.lastfm;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("WeakerAccess")
public class LastFmAlbum implements LastFmResult {

    private Album album;
    public Album getAlbum() { return album; }

    public static class Album {
        private String name;
        @SerializedName("image")
        private List<LastFmImage> images = new ArrayList<>();
        private Wiki wiki;

        public String getName() { return name; }
        public List<LastFmImage> getImages() { return images; }
        public Wiki getWiki() { return wiki; }
    }

    @Override
    public String getImageUrl() {
        if (album != null) {
            return LastFmUtils.getBestImageUrl(album.images);
        } else {
            return null;
        }
    }

    public static class Wiki {
        private String summary;
        public String getSummary() { return summary; }
    }
}