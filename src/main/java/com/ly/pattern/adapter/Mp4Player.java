package com.ly.pattern.adapter;

/**
 * @author ly
 * @Date: 2022/8/26 16:48
 */
public class Mp4Player implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("play mp4 fileName : " + fileName);
    }
}
