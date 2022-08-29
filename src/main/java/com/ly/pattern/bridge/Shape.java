package com.ly.pattern.bridge;

/**
 * @author ly
 * @Date: 2022/8/29 9:50
 */
public abstract class Shape {

    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}
