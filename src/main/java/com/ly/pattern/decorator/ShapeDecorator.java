package com.ly.pattern.decorator;

import com.ly.pattern.factory.shape.Shape;

/**
 * @author ly
 * @Date: 2022/8/30 10:44
 */
public abstract class ShapeDecorator implements Shape {

    protected Shape decoratorShape;

    public ShapeDecorator(Shape decoratorShape) {
        this.decoratorShape = decoratorShape;
    }

    @Override
    public void draw() {
        decoratorShape.draw();
    }
}
