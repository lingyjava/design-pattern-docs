package com.ly.pattern.adapter;

/**
 * @author ly
 * @Date: 2022/8/26 16:57
 */
public class MediaAdapter implements MediaPlayer{

    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase(FileTypeEnum.MP4.getCode())) {
            advancedMediaPlayer = new Mp4Player();
        }
        if (audioType.equalsIgnoreCase(FileTypeEnum.VLC.getCode())) {
            advancedMediaPlayer = new VlcPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase(FileTypeEnum.MP4.getCode())) {
            advancedMediaPlayer.playMp4(fileName);
        }
        if (audioType.equalsIgnoreCase(FileTypeEnum.VLC.getCode())) {
            advancedMediaPlayer.playVlc(fileName);
        }
    }
}
