package com.example.juegodsa.API;

import java.io.Serializable;


public class Track implements Serializable{
    String title;
    String singer;
    String id;

    public Track(String title, String singer) {
        this.singer=singer;
        this.title=title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Track [title=" + title + ", singer=" + singer +"]";
    }

}
