package com.example.musicapp;

import android.media.MediaPlayer;

/**
 * @author : Kaveesha Himasanka
 * @package : com.example.musicapp
 * @project : musicApp
 * Kaveesha Himasanka
 * 2022-Aug
 * @since : 0.1.0
 **/
public class MyMediaPlayer {
    static MediaPlayer instance;

    public static MediaPlayer getInstance() {
        if (instance == null) {
            instance = new MediaPlayer();
        }
        return instance;
    }

    public static int currentIndex = -1;
}
