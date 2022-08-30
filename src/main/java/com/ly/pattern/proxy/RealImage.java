package com.ly.pattern.proxy;

/**
 * @author ly
 * @Date: 2022/8/30 14:18
 */
public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("load image from disk");
    }

    @Override
    public void display() {
        System.out.println("Displaying : " + fileName);
    }
}
