package com.ly.pattern.decorator;

import com.ly.pattern.factory.shape.Circle;
import com.ly.pattern.factory.shape.Rectangle;
import com.ly.pattern.factory.shape.Shape;

/**
 * @author ly
 * @Date: 2022/8/30 10:51
 */
public class DecoratorService {

    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape circleRed = new RedShapeDecorator(circle);
        circleRed.draw();

        Shape rectangle = new Rectangle();
        Shape rectangleRed = new RedShapeDecorator(rectangle);
        rectangleRed.draw();
    }
}
