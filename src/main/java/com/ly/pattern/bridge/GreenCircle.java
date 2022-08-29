package com.ly.pattern.bridge;

/**
 * @author ly
 * @Date: 2022/8/29 9:49
 */
public class GreenCircle implements DrawAPI{

    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.printf("draw green circle radius : %s , x : %s , y : %s %n", radius, x, y);
    }
}
