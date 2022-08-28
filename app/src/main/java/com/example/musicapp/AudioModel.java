package com.example.musicapp;

import java.io.Serializable;

/**
 * @author : Kaveesha Himasanka
 * @package : com.example.musicapp
 * @project : musicApp
 * Kaveesha Himasanka
 * 2022-Aug
 * @since : 0.1.0
 **/
public class AudioModel implements Serializable {
    private String path;
    private String title;
    private String duration;

    public AudioModel(String path, String title, String duration) {
        this.setPath(path);
        this.setTitle(title);
        this.setDuration(duration);
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }
}
