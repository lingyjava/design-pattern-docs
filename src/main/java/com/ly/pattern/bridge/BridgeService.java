package com.ly.pattern.bridge;

/**
 * @author ly
 * @Date: 2022/8/29 10:44
 */
public class BridgeService {

    public static void drawCircle() {
        Shape redCircle = new Circle(0, 0, 10, new RedCircle());
        Shape greenCircle = new Circle(0, 0, 10, new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }

    public static void main(String[] args) {
        drawCircle();
    }
}
