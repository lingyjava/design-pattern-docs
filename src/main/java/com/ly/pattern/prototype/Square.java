package com.ly.pattern.prototype;

/**
 * @author ly
 * @Date: 2022/8/26 15:46
 */
public class Square extends Shape{

    public Square() {
        type = "Square";
    }

    @Override
    void draw() {
        System.out.println(this.getClass().getSimpleName());
    }
}
