package com.ly.pattern.adapter;

/**
 * @author ly
 * @Date: 2022/8/26 16:45
 *
 * 适配器模式（Adapter Pattern）是作为两个不兼容的接口之间的桥梁。这种类型的设计模式属于结构型模式，它结合了两个独立接口的功能。
 * 适配器不是在详细设计时添加的，而是解决正在服役的项目的问题。
 */
public class AdapterService {

    public static void play(String audioType, String fileName) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play(audioType, fileName);
    }

    public static void main(String[] args) {
        play("MP4", "test.mp4");
        play("AVI", "test.avi");
    }
}
