package com.ly.pattern.factory.shape;

/**
 * @author ly
 * @Date: 2022/8/25 15:06
 */
public class ShapeService {

    private static final ShapeFactory SHAPE_FACTORY = new ShapeFactory();

    public static void draw() {
        SHAPE_FACTORY.getShape(ShapeEnum.CIRCLE.getCode()).draw();
        SHAPE_FACTORY.getShape(ShapeEnum.SQUARE.getCode()).draw();
        SHAPE_FACTORY.getShape(ShapeEnum.RECTANGLE.getCode()).draw();
    }

    public static void main(String[] args) {
        draw();
    }
}
