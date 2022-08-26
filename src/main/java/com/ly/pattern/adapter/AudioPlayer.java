package com.ly.pattern.adapter;

/**
 * @author ly
 * @Date: 2022/8/26 16:49
 */
public class AudioPlayer implements MediaPlayer{
    @Override
    public void play(String audioType, String fileName) {
        if (FileTypeEnum.MP3.getCode().equals(audioType)) {
            play(audioType, fileName);
        }
        if (FileTypeEnum.MP4.getCode().equalsIgnoreCase(audioType) ||
            FileTypeEnum.VLC.getCode().equalsIgnoreCase(audioType)) {
            MediaAdapter mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else {
            System.out.println("Invalid fileType");
        }
    }
}
