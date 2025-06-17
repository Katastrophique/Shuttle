package com.simplecity.amp_library.http.lastfm;

import com.google.gson.annotations.SerializedName;

@SuppressWarnings("WeakerAccess")
public class LastFmImage {

    @SerializedName("#text")
    public String url;

    private String size;

    public String getSize() { return size; }
    public void setSize(String size) { this.size = size; }
}