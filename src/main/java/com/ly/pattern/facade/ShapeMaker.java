package com.ly.pattern.facade;

import com.ly.pattern.factory.shape.Circle;
import com.ly.pattern.factory.shape.Rectangle;
import com.ly.pattern.factory.shape.Shape;
import com.ly.pattern.factory.shape.Square;

/**
 * @author ly
 * @Date: 2022/8/30 11:24
 */
public class ShapeMaker {
    /**圆形*/
    private Shape circle;
    /**矩形*/
    private Shape rectangle;
    /**正方形*/
    private Shape square;

    public ShapeMaker() {
        circle = new Circle();
        rectangle = new Rectangle();
        square = new Square();
    }

    public void draw() {
        circle.draw();
        rectangle.draw();
        square.draw();
    }
}
