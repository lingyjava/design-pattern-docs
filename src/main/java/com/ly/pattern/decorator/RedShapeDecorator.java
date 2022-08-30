package com.ly.pattern.decorator;

import com.ly.pattern.factory.shape.Shape;

/**
 * @author ly
 * @Date: 2022/8/30 10:46
 */
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decorator) {
        super(decorator);
    }

    @Override
    public void draw() {
        decoratorShape.draw();
        System.out.println("color : red");
    }
}
