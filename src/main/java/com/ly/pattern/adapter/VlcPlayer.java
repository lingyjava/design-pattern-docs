package com.ly.pattern.adapter;

/**
 * @author ly
 * @Date: 2022/8/26 16:47
 */
public class VlcPlayer implements AdvancedMediaPlayer{
    @Override
    public void playVlc(String fileName) {
        System.out.println("playing vlc fileName : " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
