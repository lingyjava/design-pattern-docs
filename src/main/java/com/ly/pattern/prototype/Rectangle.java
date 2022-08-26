package com.ly.pattern.prototype;

/**
 * @author ly
 * @Date: 2022/8/26 15:45
 */
public class Rectangle extends Shape{

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println(this.getClass().getSimpleName());
    }
}
