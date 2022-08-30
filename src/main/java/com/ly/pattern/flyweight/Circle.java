package com.ly.pattern.flyweight;

import com.ly.pattern.factory.shape.Shape;

/**
 * @author ly
 * @Date: 2022/8/30 11:33
 */
public class Circle implements Shape {

    private String color;
    private int x;
    private int y;
    private int radius;

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(String color) {
        this.color = color;
    }



    @Override
    public void draw() {
        System.out.printf("draw circle x : %s, y : %s, radius : %s%n", x, y, radius);
    }
}
