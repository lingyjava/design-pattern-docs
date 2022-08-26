package com.ly.pattern.prototype;

/**
 * @author ly
 * @Date: 2022/8/26 15:47
 */
public class Circle extends Shape{

    public Circle() {
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println(this.getClass().getSimpleName());
    }
}
