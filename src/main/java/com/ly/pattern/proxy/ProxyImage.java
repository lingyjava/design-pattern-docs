package com.ly.pattern.proxy;

/**
 * @author ly
 * @Date: 2022/8/30 14:22
 */
public class ProxyImage implements Image{

    private String fileName;
    private Image realImage;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
